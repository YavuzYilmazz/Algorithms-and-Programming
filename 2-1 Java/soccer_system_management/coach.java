package soccermanagementsystem;

public class coach {
	private String name;
	private Address address;
	private Phone phone;
	private String team;
	private Date date;
	private String salary;
	public coach(String name,String street, String district, String city, String country,String country_code, String city_code, String phone, String team, String start_day, String start_month, String start_year, String end_day, String end_month,
			String end_year,String salary) {
		this.name = name;
		this.address= new Address(street,district,city,country);
		this.phone = new Phone(country_code,city_code,phone);
		this.team = team;
		this.date = new Date(start_day,start_month,start_year,end_day,end_month,end_year);
		this.salary = salary;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
