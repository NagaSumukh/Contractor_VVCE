package Contractor_management.customers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Contractor_management.contractor.Contractor;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/contractors/{id}/courses")
	public List<Customer> getAllCustomers(@PathVariable String id) {
		return customerService.getAllCustomers(id);
	}
	
	@RequestMapping("/contractors/{id}/courses/{Id}")
	public Optional<Customer> getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/contractors{conId}/course")
	public void addCustomer(@RequestBody Customer course,@PathVariable String topicId) {
		course.setTopic(new Contractor(topicId,"","",""));
		customerService.addCustomer(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contractors{topicId}/course/{id}")
	public void updateCustomer(@RequestBody Customer course,@PathVariable String topicId,@PathVariable String id) {
		course.setTopic(new Contractor(topicId,"","",""));
		customerService.updateCustomer(course);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contractors{topicId}/course/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}
}
