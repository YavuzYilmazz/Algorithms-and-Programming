package soccermanagementsystem;

public class Phone {
	private String country_code;
	private String city_code;
	private String phone;
	
	public Phone(String country_code, String city_code, String phone) {
		this.country_code = country_code;
		this.city_code = city_code;
		this.phone = phone;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
