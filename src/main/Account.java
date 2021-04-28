package main;

public abstract class Account {
	private String username;
	private String password;
	private Individual individual;
	
	public Account() {
		
	}
	
	public Account(String username, String password, Individual individual) {
		super();
		this.username = username;
		this.password = password;
		this.individual = individual;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Individual getIndividual() {
		return individual;
	}
	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", individual=" + individual + "]";
	}
}
