package javaOracleFetching.service.Impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleFetching.mapper.UserMapper;
import javaOracleFetching.model.User;
import javaOracleFetching.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper mapper;	
	
	@Override
	public List<User> getAllUser() throws Exception {
		List<User> result = mapper.getAllUser();
		return result;
	}

	@Override
	public User getUserById(long userId) throws SQLException {
		User result = mapper.getUserById(userId);
		return result;
	}

	@Override
	public List<User> getUserListByRoleIdAndRoleName(long roleId, String roleName) throws SQLException {
		List<User> result = mapper.getUserListByRoleIdAndRoleName(roleId, roleName);
		return result;
	}

	@Override
	public void saveUser(User userParam) throws SQLException {		
		mapper.saveUser(userParam);
		
	}

	@Override
	public void deleteUser(long userId) throws SQLException {
		mapper.deleteUser(userId);;
		
	}

	@Override
	public void updateUserNameByUserId(long userId, String userName) throws SQLException {
		mapper.updateUserNameByUserId(userId, userName);
		
	}
	
}
