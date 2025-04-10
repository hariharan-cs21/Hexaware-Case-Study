package hexaware.case_study.auth;


import hexaware.case_study.entity.Customer;
import hexaware.case_study.entity.Admin;

public class AuthenticationService {
    public boolean authenticateCustomer(Customer customer, String password) {
        return customer.authenticate(password);
    }

    public boolean authenticateAdmin(Admin admin, String password) {
        return admin.authenticate(password);
    }
}
