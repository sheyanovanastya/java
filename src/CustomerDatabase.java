import java.util.HashSet;
import java.util.Set;

public class CustomerDatabase {
    private Set<Customer> customers = new HashSet<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public boolean containsCustomer(Customer customer) {
        return customers.contains(customer);
    }
}