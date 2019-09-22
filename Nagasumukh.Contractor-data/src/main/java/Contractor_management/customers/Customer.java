package Contractor_management.customers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import Contractor_management.contractor.Contractor;

@Entity
public class Customer {
	@Id
	private String cusid;
	private String name;
	private String description;
	
	@ManyToOne
	private Contractor contractor;
	
	public Customer() {
		
	}
	
	public Customer(String cusid, String name, String description,String conId) {
		super();
		this.cusid = cusid;
		this.name = name;
		this.description = description;
		this.contractor = new Contractor(conId,"","","");
	}
	public String getId() {
		return cusid;
	}
	public void setId(String cusid) {
		this.cusid = cusid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setTopic(Contractor contractor) {
		this.contractor = contractor;
		
	}

}
