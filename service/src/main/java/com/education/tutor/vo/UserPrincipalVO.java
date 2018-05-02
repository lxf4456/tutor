package com.education.tutor.vo;


import com.education.tutor.db.domain.TblMenu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPrincipalVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	List<String> roles = new ArrayList<String>();

	List<String> authorities = new ArrayList<String>();

	List<Menu> menus = new ArrayList<Menu>();

	private Map<String,List<String>> userRoles = new HashMap();

	public Map<String, List<String>> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Map<String, List<String>> userRoles) {
		this.userRoles = userRoles;
	}


	public static class Menu {
		public Long getMenuId() {
			return menuId;
		}

		public void setMenuId(Long menuId) {
			this.menuId = menuId;
		}

		public String getMenuName() {
			return menuName;
		}

		public void setMenuName(String menuName) {
			this.menuName = menuName;
		}

		public String getMenuLang() {
			return menuLang;
		}

		public void setMenuLang(String menuLang) {
			this.menuLang = menuLang;
		}

		public String getMenuUrl() {
			return menuUrl;
		}

		public void setMenuUrl(String menuUrl) {
			this.menuUrl = menuUrl;
		}

		public Integer getMenuStatus() {
			return menuStatus;
		}

		public void setMenuStatus(Integer menuStatus) {
			this.menuStatus = menuStatus;
		}

		public Long getMenuParentId() {
			return menuParentId;
		}

		public void setMenuParentId(Long menuParentId) {
			this.menuParentId = menuParentId;
		}

		public Integer getMenuType() {
			return menuType;
		}

		public void setMenuType(Integer menuType) {
			this.menuType = menuType;
		}

		public String getIconcls() {
			return iconcls;
		}

		public void setIconcls(String iconcls) {
			this.iconcls = iconcls;
		}

		public Integer getExpand() {
			return expand;
		}

		public void setExpand(Integer expand) {
			this.expand = expand;
		}

		public Integer getSortNo() {
			return sortNo;
		}

		public void setSortNo(Integer sortNo) {
			this.sortNo = sortNo;
		}

		public Integer getIsShow() {
			return isShow;
		}

		public void setIsShow(Integer isShow) {
			this.isShow = isShow;
		}

		public String getPermission() {
			return permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		Long menuId;
		String menuName;
		String menuLang;
		String menuUrl;
		Integer menuStatus;
		Long menuParentId;
		Integer menuType;
		String iconcls;
		Integer expand;
		Integer sortNo;
		Integer isShow;
		String permission;
	}

//	public TblUserMain getBasic() {
//		return basic;
//	}
//
//	public void setBasic(TblUserMain basic) {
//		this.basic = basic;
//	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<TblMenu> menus) {
		menus.forEach(tm -> {
			Menu m = new Menu();
			m.setExpand(tm.getExpand());
//			m.setIconcls(tm.getIconcls());
			m.setIsShow(tm.getIsShow());
			m.setMenuId(tm.getId().longValue());
//			m.setMenuLang(tm.getMenuLang());
			m.setMenuName(tm.getMenuName());
//			m.setMenuParentId(tm.getMenuParentId());
//			m.setMenuStatus(tm.getMenuStatus());
			m.setMenuType(tm.getMenuType());
//			m.setMenuUrl(tm.getMenuUrl());
			m.setPermission(tm.getPermission());
			m.setSortNo(tm.getSortNo());
			this.menus.add(m);
		});
	}
	//groups表中 =groupCategory：groupCategory ，domain_auth表中：groupCategory = auth_+target_type-name
	public static class UserRoles {
		private String groupCategory;
		private List<String> roles ;

		public String getGroupCategory() {
			return groupCategory;
		}

		public void setGroupCategory(String groupCategory) {
			this.groupCategory = groupCategory;
		}

		public List<String> getRoles() {
			return roles;
		}

		public void setRoles(List<String> roles) {
			this.roles = roles;
		}
	}

	private List<String> getUserRoles(String groupCategory){
		List<String> mapLt = this.userRoles.get(groupCategory);
		if(mapLt ==null||mapLt.isEmpty()){
			mapLt = new ArrayList<>();
		}
		return mapLt;
	}



}
