package Contractor_management.customers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository courseRepository;
	
	//This function will return List all cutsomers under that particular contractor
	public List<Customer> getAllCustomers(String conid) {
		//return customers;
		List<Customer> customers = new ArrayList<>();
		courseRepository.findByTopicId(conid).forEach(customers::add);
		return customers;
	}
	
	//This function is going to return particular customer by calling his ID
	public Optional<Customer> getCustomer(String id) {
		//return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}
	
	//This function is going to add new customer for a particular contractor
	public void addCustomer(Customer course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	
	public void deleteCustomer(String id) {
		courseRepository.deleteById(id);
	}

	public void updateCustomer(Customer course) {
		courseRepository.save(course);
	}


}
