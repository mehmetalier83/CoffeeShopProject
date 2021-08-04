import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdepters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager neroCustomerManager=new NeroCustomerManager();
        BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdepters());
        Customer customer1=new Customer();
        customer1.setFirstName("Mehmet Ali");
        customer1.setLastName("Er");
        customer1.setDateOfBirth(LocalDate.of(1999,4,18));
        customer1.setNationalityId("00000000000");
        customer1.setId(10);
       neroCustomerManager.Save(customer1);
       starbucksCustomerManager.Save(customer1);
    }
}
