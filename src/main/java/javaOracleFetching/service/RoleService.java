package javaOracleFetching.service;

import java.util.List;

import javaOracleFetching.model.Role;

public interface RoleService {
	List<Role> getAllRole();
	
	void saveRole(Role newRole);
}
