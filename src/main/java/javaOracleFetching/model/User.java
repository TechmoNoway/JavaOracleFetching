package javaOracleFetching.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long maKH;
	private String tenKH;
	private String diaChi;
	private String mail;
	private String phone;
	private String image;
	private Date birthday;
	private String isUse;
	private String roleId;
	
}
