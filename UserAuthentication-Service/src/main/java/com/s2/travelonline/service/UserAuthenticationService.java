package com.s2.travelonline.service;

import com.s2.travelonline.exception.UserAlreadyExistsException;
import com.s2.travelonline.exception.UserNotFoundException;
import com.s2.travelonline.model.User;

public interface UserAuthenticationService {

    	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */

    public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException;

    boolean saveUser(User user) throws UserAlreadyExistsException;
}
