package mx.com.root.sintec.dao;

import mx.com.root.sintec.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * parent
 * <p>
 * The long description of the file's purpose goes here and describes in detail the complete functionality of the file.
 * This description can span several lines and ends with a period.
 * - Management
 *
 * @author *Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;, https://github.com/bhitOmicron/
 * @version 0.1
 * @summary A short description of the file.
 * @license The Unlicense, http://unlicense.org/
 * @updated 10/10/17
 * @link url goes here
 * @since 1.0.0
 */
@Repository
public class DemoDao {
    // Dummy database. Initialize with some dummy values.
    private static List customers;

    {
        customers = new ArrayList();
        customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
        customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
        customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
    }

    /**
     * Returns list of customers from dummy database.
     *
     * @return list of customers
     */
    public List list() {
        return customers;
    }

}
