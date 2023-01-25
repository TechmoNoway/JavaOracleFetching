package javaOracleFetching.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleFetching.mapper.RoleMapper;
import javaOracleFetching.model.Role;
import javaOracleFetching.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper mapper;
	
	@Override
	public List<Role> getAllRole() {
		
		return mapper.getAllRole();
	}

	@Override
	public void saveRole(Role newRole) {
		mapper.saveRole(newRole);
		
	}
	
}
