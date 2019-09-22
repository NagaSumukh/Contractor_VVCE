package Contractor_management.customers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,String>{
	public List<Customer> findByTopicId(String topicId);
}
