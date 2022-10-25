package soccermanagementsystem;

public class player {
	private String licensenumber;
	private String name_surname;
	private Date date;
	private String nationality;
	private Address address;
	private Phone phone;
	private String team;
	private String salary;
	private String positionalrole;
	
	
	public player(String licensenumber, String name_surname,String birth_day,String birth_month,String birth_year, String nationality, String street, String district, String city, String country,
			String country_code, String city_code, String phone, String team,String start_day, String start_month, String start_year, String end_day, String end_month,
			String end_year, String salary, String positionalrole) {
		super();
		this.licensenumber = licensenumber;
		this.name_surname = name_surname;
		this.date = new Date(birth_day,birth_month,birth_year,start_day,start_month,start_year,end_day,end_month,end_year);
		this.nationality = nationality;
		this.address= new Address(street,district,city,country);
		this.phone = new Phone(country_code,city_code,phone);
		this.team = team;
		this.salary = salary;
		this.positionalrole = positionalrole;
	}


	public String getLicensenumber() {
		return licensenumber;
	}


	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}


	public String getName_surname() {
		return name_surname;
	}


	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
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


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getPositionalrole() {
		return positionalrole;
	}


	public void setPositionalrole(String positionalrole) {
		this.positionalrole = positionalrole;
	}


	
	
}
