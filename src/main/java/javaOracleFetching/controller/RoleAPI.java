package javaOracleFetching.controller;

import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaOracleFetching.model.Role;
import javaOracleFetching.service.RoleService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/role")
public class RoleAPI {
	@Autowired
	RoleService roleservice;
	
	@GetMapping("/getAllRole")
	ResponseEntity<?> doGetAllRole(){
		
		List<Role> result = roleservice.getAllRole();
		
		return ResponseEntity.ok(result);
		
	}
	
	@PostMapping("/saveRole")
	ResponseEntity<?> doSaveRole(@RequestBody Role newRole){
		HashMap<String, Object> result = new HashMap<>();
		
		try {
			roleservice.saveRole(newRole);
			result.put("success", true);
			result.put("message", "Success to call API saveRole");
			result.put("data", newRole);
		} catch (Exception e) {
			log.error("Fail to call API saveRole");
			result.put("success", false);
			result.put("message", "Fail to call API saveRole");
			result.put("data", null);
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(result);
				
	}
	
	
}
