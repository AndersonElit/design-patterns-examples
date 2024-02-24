package flyweight.cachesystem.cache;

import flyweight.cachesystem.dao.CustomerDao;
import flyweight.cachesystem.model.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomerCache {
    private static CustomerCache customerCache;
    private final CustomerDao customerDao;
    private final Map<Integer, Customer> cache;

    private CustomerCache() {
        cache = new HashMap<>();
        this.customerDao = new CustomerDao();
    }

    public static CustomerCache getInstance() {
        if (Objects.isNull(customerCache)) {
            customerCache = new CustomerCache();
        }
        return customerCache;
    }

    public Customer findById(Integer id) {
        if (cache.containsKey(id)) {
            System.out.println("Searching customer in cache....");
            return cache.get(id);
        } else {
            System.out.println("Searching customer in database....");
            Customer customer = customerDao.findById(id);
            cache.put(id, customer);
            return customer;
        }
    }

}
