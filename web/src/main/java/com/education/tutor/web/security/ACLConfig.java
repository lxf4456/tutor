package com.education.tutor.web.security;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheFactoryBean;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.access.vote.AffirmativeBased;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.acls.AclEntryVoter;
import org.springframework.security.acls.AclPermissionEvaluator;
import org.springframework.security.acls.domain.AclAuthorizationStrategy;
import org.springframework.security.acls.domain.AclAuthorizationStrategyImpl;
import org.springframework.security.acls.domain.ConsoleAuditLogger;
import org.springframework.security.acls.domain.DefaultPermissionGrantingStrategy;
import org.springframework.security.acls.domain.EhCacheBasedAclCache;
import org.springframework.security.acls.jdbc.BasicLookupStrategy;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;
import org.springframework.security.acls.jdbc.LookupStrategy;
import org.springframework.security.acls.model.MutableAclService;
import org.springframework.security.acls.model.Permission;
import org.springframework.security.acls.model.PermissionGrantingStrategy;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


@Configuration
@Profile({ "acl" })
public class ACLConfig extends GlobalMethodSecurityConfiguration {

	@Autowired
	DataSource dataSource;

	@Bean(name = "aclEhCache")
	public EhCacheFactoryBean aclEhCache() {
		EhCacheFactoryBean factoryBean = new EhCacheFactoryBean();
		EhCacheManagerFactoryBean cacheManager = new EhCacheManagerFactoryBean();		
		factoryBean.setCacheName("aclCache");
		factoryBean.setCacheManager(cacheManager.getObject());
		return factoryBean;
	}

	@Bean
	public LookupStrategy lookupStrategy() {
		return new BasicLookupStrategy(dataSource, aclCache(), aclAuthorizationStrategy(), new ConsoleAuditLogger());
	}

	@Bean(name = "adminRole")
	public SimpleGrantedAuthority adminRole() {
		return new SimpleGrantedAuthority("ADMIN_ROLE");
	}

	@Bean
	public AclAuthorizationStrategy aclAuthorizationStrategy() {
		return new AclAuthorizationStrategyImpl(adminRole(), adminRole(), adminRole());
	}

	@Bean(name = "aclService")
	public MutableAclService aclService() {
		EhCacheBasedAclCache aclCache = aclCache();
		JdbcMutableAclService service = new JdbcMutableAclService(dataSource, lookupStrategy(), aclCache);

		service.setClassIdentityQuery("select @@IDENTITY");
		service.setSidIdentityQuery("select @@IDENTITY");
		return service;
	}

	@Bean(name = "aclDeleteVoter")
	public AclEntryVoter aclDeleteVoter() {
		String processConfigAttribute = "ACL_DELETE";
		Permission[] requirePermission = new Permission[2];
		requirePermission[0] = org.springframework.security.acls.domain.BasePermission.ADMINISTRATION;
		requirePermission[1] = org.springframework.security.acls.domain.BasePermission.DELETE;
		AclEntryVoter aclEntryVoter = new AclEntryVoter(aclService(), processConfigAttribute, requirePermission);

		return aclEntryVoter;
	}

	@Override
	protected AffirmativeBased accessDecisionManager() {
		return aclAccessDecisionManager();
	}

	@Bean(name = "aclAccessDecisionManager")
	public AffirmativeBased aclAccessDecisionManager() {
		List<AccessDecisionVoter<? extends Object>> decisionVoters = new ArrayList<AccessDecisionVoter<? extends Object>>();
		decisionVoters.add(new RoleVoter());
		decisionVoters.add(aclDeleteVoter());
		decisionVoters.add(afterAclRead());
		decisionVoters.add(aclWriteVoter());
		AffirmativeBased affirmativeBased = new AffirmativeBased(decisionVoters);
		return affirmativeBased;
	}

	@Bean(name = "afterAclRead")
	public AclEntryVoter afterAclRead() {
		String processConfigAttribute = "ACL_READ";
		Permission[] requirePermission = new Permission[2];
		requirePermission[0] = org.springframework.security.acls.domain.BasePermission.ADMINISTRATION;
		requirePermission[1] = org.springframework.security.acls.domain.BasePermission.READ;
		AclEntryVoter aclEntryVoter = new AclEntryVoter(aclService(), processConfigAttribute, requirePermission);

		return aclEntryVoter;
	}

	@Bean(name = "aclWriteVoter")
	public AclEntryVoter aclWriteVoter() {
		String processConfigAttribute = "ACL_WRITE";
		Permission[] requirePermission = new Permission[2];
		requirePermission[0] = org.springframework.security.acls.domain.BasePermission.ADMINISTRATION;
		requirePermission[1] = org.springframework.security.acls.domain.BasePermission.WRITE;
		AclEntryVoter aclEntryVoter = new AclEntryVoter(aclService(), processConfigAttribute, requirePermission);

		return aclEntryVoter;
	}

	@Override
	protected MethodSecurityExpressionHandler createExpressionHandler() {
		DefaultMethodSecurityExpressionHandler expressionHandler = new DefaultMethodSecurityExpressionHandler();
		expressionHandler.setPermissionEvaluator(new AclPermissionEvaluator(aclService()));
		return expressionHandler;

	}

	@Bean(name = "aclCache")
	public EhCacheBasedAclCache aclCache() {
		PermissionGrantingStrategy permissionGrantingStrategy = new DefaultPermissionGrantingStrategy(
				new ConsoleAuditLogger());
		return new EhCacheBasedAclCache(aclEhCache().getObject(), permissionGrantingStrategy,
				aclAuthorizationStrategy());
	}

}