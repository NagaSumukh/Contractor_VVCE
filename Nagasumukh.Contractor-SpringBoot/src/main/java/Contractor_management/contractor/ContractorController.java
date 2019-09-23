package Contractor_management.contractor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractorController {
	
	@Autowired
	private ContractorService contractorService;
	
	@RequestMapping("/contractors")
	public List<Contractor> getAllContractors() {
		return contractorService.getAllContractors();
	}
	
	@RequestMapping("/contractors/{conid}")
	public Optional<Contractor> getContractor(@PathVariable String conid) {
		return contractorService.getContractor(conid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/contractors")
	public void addContractor(@RequestBody Contractor topic) {
		contractorService.addContractor(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contractors/{conid}")
	public void updateContractor(@RequestBody Contractor topic,@PathVariable String conid) {
		contractorService.updateContractor(conid, topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contractors/{id}")
	public void deleteTopic(@PathVariable String conid) {
		contractorService.deleteContractor(conid);
	}
}
