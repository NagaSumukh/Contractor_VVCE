package Contractor_management.contractor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Contractor {
	@Id
	private String conid;
	private String name;
	private String description;
	private String phno;
	
	public Contractor() {
		
	}
	
	public Contractor(String conid, String name, String description,String phno) {
		super();
		this.conid = conid;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return conid;
	}
	public void setId(String conid) {
		this.conid = conid;
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

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}
}
