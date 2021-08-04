package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CheckCustomerService;
import Abstract.CustomerService;
import Adapters.MernisServiceAdepters;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CheckCustomerService checkCustomerService;

    public StarbucksCustomerManager(MernisServiceAdepters customerCheckManager) {
        this.checkCustomerService=customerCheckManager;
    }


    @Override
    public void Save(Customer customer) {
        if (this.checkCustomerService.checkIfRealPerson(customer)){
        super.Save(customer);
    }else{
            System.out.println("not a valid person");}
    }
}
