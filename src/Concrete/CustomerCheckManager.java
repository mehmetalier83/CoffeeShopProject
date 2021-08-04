package Concrete;

import Abstract.CheckCustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CheckCustomerService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
