package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	public static List<User> getUserList(){
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1,"jcarta","Jolanda Carta","jcarta@gmail.com", new Address("781 Pleasant Circle","","Waco","75705")));
		userList.add(new User(2,"rcuriel","Rana Curiel","rcuriel@gmail.com", new Address("90 Rocky River Lane","","El Paso","79907")));
		userList.add(new User(3,"nkimmell","Narcisa Kimmell","nkimmell@gmail.com", new Address("13 Theatre St.","","Houston","77081")));
		userList.add(new User(4,"lblay","Lia Blay","lblay@gmail.com", new Address("767 County St.","","Lake Jackson","77566")));
		userList.add(new User(5,"acurtsinger","Alita Curtsinger","acurtsinger@gmail.com", new Address("74 Logan St.","","El Paso","79927")));
		
		return userList;
		
	}
	
}
