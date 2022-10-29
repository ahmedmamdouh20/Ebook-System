package com.DataInp;

import com.Entity.User;

public interface UserData {
	public boolean userRegister(User user);
	public User userLogin(String email, String Password);
}
