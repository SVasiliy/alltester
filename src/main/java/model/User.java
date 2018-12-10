package model;

public class User {

	private Integer id;
	private String username;
	private String name;
	private String email;
	private Address address;
	
	public User(Integer id, String username, String name, String email, Address address) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
