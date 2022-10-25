package soccermanagementsystem;

public class stadium {
	private String name;
	private String city;
	private String capacity;
	private String lighting;
	private String surface;
	private boolean isAvailable;
	
	
	public stadium(String name, String city, String capacity, String lighting, String surface,boolean isAvailable) {
		this.name = name;
		this.city = city;
		this.capacity = capacity;
		this.lighting = lighting;
		this.surface = surface;
		this.isAvailable=true;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public String getLighting() {
		return lighting;
	}


	public void setLighting(String lighting) {
		this.lighting = lighting;
	}


	public String getSurface() {
		return surface;
	}


	public void setSurface(String surface) {
		this.surface = surface;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
