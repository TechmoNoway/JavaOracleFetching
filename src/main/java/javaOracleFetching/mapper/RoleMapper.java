package javaOracleFetching.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleFetching.model.Role;

@Mapper
public interface RoleMapper {
	List<Role> getAllRole();
	
	void saveRole(Role newRole);
}
