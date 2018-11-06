package alltester;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	
    // available to all users
    @RequestMapping(value = "/api/resourcea", method = RequestMethod.GET)
    public String handleResourceA() {
        return createResponse();
    }

    // available to all users
    @RequestMapping(value = "/api/resourceb", method = RequestMethod.GET)
    public String handleResourceB() {
        return createResponse();
    }

    // available to supervisors
    @RequestMapping(value = "/api/premium", method = RequestMethod.GET)
    public String handlePremiumResource() {
        return createResponse();
    }

    // available to admin
    @RequestMapping(value = "/api/admin", method = RequestMethod.GET)
    public String handleAdminResource() {
        return createResponse();
    }

    // available to managers
    @RequestMapping(value = "/api/customers", method = RequestMethod.GET)
    public String handleCustomers() {
        return "customers";
    }

    private String createResponse() {
        return "Access Granted";
    }
}
