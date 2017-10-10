package mx.com.root.sintec.controller;

import mx.com.root.sintec.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoRestController {


    private DemoDao customerDAO;

    /**
     * Creates an instance of DemoRestController.
     * TODO alguna descripción
     *
     * @param
     * @author Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;
     * @version 1.0.0
     */
    @Autowired
    public DemoRestController(DemoDao customerDAO) {
        super();
        this.customerDAO = customerDAO;
    }

    @GetMapping("/customers")
    public List getCustomers() {
        return customerDAO.list();
    }
}
