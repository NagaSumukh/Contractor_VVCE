package Contractor_management.contractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ContractorService {
	
	@Autowired
	private ContractorRepository contractorRepository;
	
	
	public List<Contractor> getAllContractors() {
		//return topics;
		List<Contractor> contractors = new ArrayList<>();
		contractorRepository.findAll().forEach(contractors::add);
		return contractors;
	}
	
	public Optional<Contractor> getContractor(String id) {
		//return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		return contractorRepository.findById(id);
	}
	
	public void addContractor(Contractor contractor) {
		//topics.add(topic);
		contractorRepository.save(contractor);
	}

	public void updateContractor(String id, Contractor contractor) {
		contractorRepository.save(contractor);
	}

	public void deleteContractor(String conid) {
		contractorRepository.deleteById(conid);
	}
}
