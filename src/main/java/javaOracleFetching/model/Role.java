package javaOracleFetching.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	private String roleId;
	private String roleName;
	private String isUse;
	private String image;
	private String description;
	
}
