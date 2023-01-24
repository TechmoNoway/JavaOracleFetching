package javaOracleFetching.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javaOracleFetching.model.User;

@Mapper
public interface UserMapper {
	
	List<User> getAllUser() throws Exception;
	
	User getUserById(@Param("userId") long userId) throws SQLException;
	
	List<User> getUserListByRoleIdAndRoleName(@Param("roleId") long roleId, @Param("roleName") String roleName) throws SQLException;
	
	void saveUser(User userParam) throws SQLException;
	
	void deleteUser(@Param("userId") long userId) throws SQLException;
	
	void updateUserNameByUserId(@Param("userId") long userId, @Param("userName") String userName) throws SQLException;
}
