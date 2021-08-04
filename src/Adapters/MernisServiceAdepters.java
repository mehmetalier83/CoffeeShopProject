package Adapters;

import Abstract.CheckCustomerService;
import Abstract.CustomerService;
import Entities.Customer;
import MernisService.BJJKPSPublicSoap;

public class MernisServiceAdepters implements CheckCustomerService {
    BJJKPSPublicSoap bjjkpsPublicSoap =new BJJKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return bjjkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(),
                    customer.getLastName(), customer.getDateOfBirth().getDayOfYear());
        } catch (Exception e) {
            e.printStackTrace();
        }return false;
    }
}
