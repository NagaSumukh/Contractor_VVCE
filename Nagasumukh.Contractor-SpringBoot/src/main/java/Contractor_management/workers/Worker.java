package Contractor_management.workers;

import javax.persistence.Entity;

import Contractor_management.customers.Customer;

@Entity
public class Worker {
	
	private String workerId;
	private String name;
	private int salary;
	
	
	private Customer customer;
	
	public Worker(String workerId, String name, int salary, String cusid,String conid) {
		super();
		this.workerId = workerId;
		this.name = name;
		this.salary = salary;
		this.customer = new Customer(cusid,"","",conid);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
