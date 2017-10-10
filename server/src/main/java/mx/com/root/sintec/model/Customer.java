package mx.com.root.sintec.model;

import lombok.Data;

import java.util.Date;

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
@Data
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private Date dateOfBirth;

    public Customer(long id, String firstName, String lastName, String email, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.dateOfBirth = new Date();
    }

    public Customer() {
    }
}
