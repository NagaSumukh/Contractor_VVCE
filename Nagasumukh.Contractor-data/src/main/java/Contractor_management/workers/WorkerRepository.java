package Contractor_management.workers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker,String>{
	
	
	public List<Worker> findByWorkerId(String cusid);

}
