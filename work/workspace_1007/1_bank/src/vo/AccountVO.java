package vo;

public abstract class AccountVO {
	
	String username;
	int accountPeriod;
	
	
	public AccountVO() {}
	
	
	public AccountVO(int accountPeriod) {
		super();
		this.accountPeriod = accountPeriod;
	}

	public AccountVO(String username, int accountPeriod) {
		super();
		this.username = username;
		this.accountPeriod = accountPeriod;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAccountPeriod() {
		return accountPeriod;
	}

	public void setAccountPeriod(int i) {
		this.accountPeriod = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountPeriod;
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
		AccountVO other = (AccountVO) obj;
		if (accountPeriod != other.accountPeriod)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountVO [username=" + username + ", accountPeriod=" + accountPeriod + "]";
	}

	

}
