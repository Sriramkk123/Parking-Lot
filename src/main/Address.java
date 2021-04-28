package main;

public class Address {
	private String street;
	private String landmark;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(){
	}
	
	public Address(String street, String landmark, String city, String state, String zipcode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
}
