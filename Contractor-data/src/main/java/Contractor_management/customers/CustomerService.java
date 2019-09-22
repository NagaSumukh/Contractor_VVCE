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
	
	
	public List<Customer> getAllCustomers(String topicId) {
		//return topics;
		List<Customer> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Optional<Customer> getCustomer(String id) {
		//return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}
	
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
