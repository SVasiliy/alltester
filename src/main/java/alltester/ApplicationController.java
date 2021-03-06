package alltester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import model.User;
import model.UserList;


@RestController
public class ApplicationController {
	
	@Autowired
	private Environment env;
	
	
    // get application.properties version
    @RequestMapping(value = "/api/version", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String getVersion() {
        return env.getProperty("version"); 
    }

	
    // available to all users
    @RequestMapping(value = "/api/resourcea", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String handleResourceA() {
        return createResponse();
    }

    // available to all users
    @RequestMapping(value = "/api/resourceb", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String handleResourceB() {
        return createResponse();
    }

    // available to supervisors
    @RequestMapping(value = "/api/premium", method = RequestMethod.GET)
    @CrossOrigin(origins = {"http://localhost:9000", "http://vsharapov.com"}, allowCredentials = "true")
    public String handlePremiumResource() {
        return createResponse();
    }

    // available to admin
    @RequestMapping(value = "/api/admin", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String handleAdminResource() {
        return createResponse();
    }

    // available to managers
    @RequestMapping(value = "/api/customers", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String handleCustomers() {
        return "customers";
    }
    

    // for testing inside alltesterui
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String getUserList() {
    	
    	Gson gson = new Gson();
    	return gson.toJson(UserList.getUserList());
    	
    }

    @RequestMapping(value = "/api/users/{userId}", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public User getUser(@PathVariable Integer userId) {
    	
    	return UserList.getUserList().stream().filter(x -> x.getId().equals(userId)).findFirst().get();
    	
    }
    
    
    private String createResponse() {
        return "Access Granted!";
    }
}
