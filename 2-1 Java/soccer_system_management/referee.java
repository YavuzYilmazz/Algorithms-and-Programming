package soccermanagementsystem;

public class referee {
	private String name;
	private Address address;
	private Phone phone;
	private int salary;
	
	
	public referee(String name, String street, String district, String city,String country, String country_code, String city_code, String phone, String salary) {
		this.name = name;
		this.address= new Address(street,district,city,country);
		this.phone = new Phone(country_code,city_code,phone);
		int salaryy = Integer.valueOf(salary);
		this.salary = salaryy;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Phone getPhone() {
		return phone;
	}


	public void setPhone(Phone phone) {
		this.phone = phone;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary= salary*110/100;
	}


	
	
}
