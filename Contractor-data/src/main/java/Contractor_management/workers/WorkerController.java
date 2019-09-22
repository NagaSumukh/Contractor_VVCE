package Contractor_management.workers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Contractor_management.customers.Customer;
import Contractor_management.customers.CustomerService;

@RestController
public class WorkerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/contractors/{id}/courses/{id}")
	public List<Customer> getAllCustomers(@PathVariable String id) {
		return customerService.getAllCustomers(id);
	}
}
