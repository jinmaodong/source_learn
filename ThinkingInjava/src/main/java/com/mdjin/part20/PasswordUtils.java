package com.mdjin.part20;

import java.util.List;

/**
 * 使用UseCase注解
 * @author jinma
 *
 */
public class PasswordUtils {

	@UseCase(id = 47,description = "Password must contail at least on numeric.")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuffer(password).reverse().toString();
	}
	
	@UseCase(id = 49,description = "New password can't equal proviously used ones.")
	public boolean checkForNewPassword(List<String> prevPassword,String password) {
		return !prevPassword.contains(password);
	}
	
}
