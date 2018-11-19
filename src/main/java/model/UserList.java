package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	public static List<User> getUserList(){
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1,"user1","username1","user1@gmail.com"));
		userList.add(new User(2,"user2","username2","user2@gmail.com"));
		userList.add(new User(3,"user3","username3","user3@gmail.com"));
		userList.add(new User(4,"user4","username4","user4@gmail.com"));
		userList.add(new User(5,"user5","username5","user5@gmail.com"));
		userList.add(new User(6,"user6","username6","user6@gmail.com"));
		userList.add(new User(7,"user7","username7","user7@gmail.com"));
		userList.add(new User(8,"user8","username8","user8@gmail.com"));
		userList.add(new User(9,"user9","username9","user9@gmail.com"));
		userList.add(new User(10,"user10","username10","user10@gmail.com"));
		
		return userList;
		
	}
	
}
