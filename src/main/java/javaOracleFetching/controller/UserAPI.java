package javaOracleFetching.controller;

import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaOracleFetching.model.User;
import javaOracleFetching.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserAPI {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUser")
	ResponseEntity<?> doGetAllUser() throws Exception{
		
		return ResponseEntity.ok(userService.getAllUser());
			
	}
	
	@GetMapping("/getUserById")
	ResponseEntity<?> doGetUserById(@RequestParam("id") long userId) throws SQLException {
		
		return ResponseEntity.ok(userService.getUserById(userId));
		
	}
	
	@GetMapping("/getUserListByRoleIdAndRoleName")
	ResponseEntity<?> doGetUserListByRoleIdAndRoleName(@RequestParam("roleid") long roleId, @RequestParam("rolename") String roleName) throws Exception {
		
		return ResponseEntity.ok(userService.getUserListByRoleIdAndRoleName(roleId, roleName));
		
	}
	
	@PostMapping("/saveUser")
	ResponseEntity<?> doPostSaveUser(@RequestBody User userParam) throws SQLException{
		HashMap<String, Object> result = new HashMap<>();
		
		try {
			userService.saveUser(userParam);
			result.put("success", true);
			result.put("message", "Call API saveUser successfully");
			result.put("data", userParam);
		} catch (Exception e) {
			log.error("Fail to call API saveUser");
			result.put("success", false);
			result.put("message", "Fail to call API saveUser");
			result.put("data", null);
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(result);
	}
	
	@DeleteMapping("/deleteUser")
	ResponseEntity<?> doDeleteUser(@RequestParam("userid") long userId) throws SQLException{
		HashMap<String, Object> result = new HashMap<>();
		try {
			userService.deleteUser(userId);
			result.put("success", true);
			result.put("message", "Success to call API deleteUser");
			result.put("data", userId);
		} catch (Exception e) {
			log.error("Fail to call API deleteUser");
			result.put("success", false);
			result.put("message", "Fail to call API deleteUser");
			result.put("data", null);
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(result);
			
	}
	
	@PutMapping("/updateUserNameByUserId")
	ResponseEntity<?> doUpdateUserNameByUserId(@RequestParam("userid") long userId, @RequestParam("username") String userName) throws SQLException{
		HashMap<String, Object> result = new HashMap<>();
		
		try {
			userService.updateUserNameByUserId(userId, userName);
			result.put("success", true);
			result.put("message", "Success to call API updateUser");
			result.put("data", userId);
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", "Fail to call API updateUser");
			result.put("data", null);
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(result);
			
	}
	
}



















