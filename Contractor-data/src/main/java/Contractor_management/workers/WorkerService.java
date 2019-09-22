package Contractor_management.workers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
		
		@Autowired
		private WorkerRepository workerRepository;
		
		public List<Worker> getAllWorkers(String cusid) {
			//return workers;
			List<Worker> workers = new ArrayList<>();
			workerRepository.findByWorkerId(cusid).forEach(workers::add);
			return workers;
		}
		
}
