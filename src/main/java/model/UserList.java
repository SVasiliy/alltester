package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	public static List<User> getUserList(){
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1,"user1","username1","user1@gmail.com", new Address()));
		userList.add(new User(2,"user2","username2","user2@gmail.com", new Address("street 1"," suite 1","Somecity","99999")));
		userList.add(new User(3,"user3","username3","user3@gmail.com", new Address()));
		
		return userList;
		
	}
	
}
