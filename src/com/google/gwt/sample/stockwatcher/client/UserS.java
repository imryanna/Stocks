package com.google.gwt.sample.stockwatcher.client;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class UserS {

	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();
}
