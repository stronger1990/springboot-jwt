package com.pjb.springbootjjwt.entity;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

/**
 * @author jinbin
 * @date 2018-07-08 20:43
 * 
 * IDEA可以装插件lombok，然后加上注解@Data就不需要写setter和getter了，因为Eclipse装不了lombok所以只能写上setter getter，右键找到override自动生成也可以
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {
	private String id;
	private String username;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
