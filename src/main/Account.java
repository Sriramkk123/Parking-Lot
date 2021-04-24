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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((individual == null) ? 0 : individual.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (individual == null) {
			if (other.individual != null)
				return false;
		} else if (!individual.equals(other.individual))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
}
