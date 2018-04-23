package com.education.tutor.service;

import com.education.tutor.db.readonly.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QueryService {

	@Autowired
	QueryMapper queryMapper;
		
	public List<String> queryAuthority(String username) {
		List<String> result = queryMapper.queryAuthority(username);		
		return result;
	}

	/**
	 * for test only, used for throwing exception for readonly connection 
	 * @param username
	 * @param authority
	 */
	public void insertAuthoritiesTest(String username, String authority) {
		queryMapper.insertAuthorities(username, authority);
	}

}
