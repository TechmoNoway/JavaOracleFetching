package javaOracleFetching.service;

import java.sql.SQLException;
import java.util.List;

import javaOracleFetching.model.User;


public interface UserService {
	
	List<User> getAllUser() throws Exception;	
	
	User getUserById(long userId) throws SQLException;
	
	List<User> getUserListByRoleIdAndRoleName(long roleId, String roleName) throws SQLException;
	
	void saveUser(User userParam) throws SQLException;
	
	void deleteUser(long userId) throws SQLException;
}
