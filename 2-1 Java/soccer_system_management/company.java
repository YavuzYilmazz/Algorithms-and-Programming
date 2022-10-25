package soccermanagementsystem;

public class company {
	private String name;
	private Address address;
	private Phone phone;
	private String team;
	

	
	
	public company(String name,  String street, String district, String city,String country, String country_code, String city_code, String phone, String team) {
		this.name = name;
		this.address= new Address(street,district,city,country);
		this.phone = new Phone(country_code,city_code,phone);
		this.team = team;
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


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}



}
