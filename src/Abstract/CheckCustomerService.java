package Abstract;

import Entities.Customer;

public interface CheckCustomerService {
    boolean checkIfRealPerson(Customer customer);
}
