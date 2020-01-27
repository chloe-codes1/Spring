package a;

public class Savings {
	
	String accountnumber;
	String username;
	int accountperiod;
	int monthlyDeposit;
	int interest;
	double interestRate;
	int totalInput;
	int total;
	
	
	public Savings() {}
	
	public Savings(String accountnumber, String username, int accountperiod, int monthlyDeposit, int interest,
			double interestRate, int totalInput, int total) {
		super();
		this.accountnumber = accountnumber;
		this.username = username;
		this.accountperiod = accountperiod;
		this.monthlyDeposit = monthlyDeposit;
		this.interest = interest;
		this.interestRate = interestRate;
		this.totalInput = totalInput;
		this.total = total;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAccountperiod() {
		return accountperiod;
	}

	public void setAccountperiod(int accountperiod) {
		this.accountperiod = accountperiod;
	}

	public int getMonthlyDeposit() {
		return monthlyDeposit;
	}

	public void setMonthlyDeposit(int monthlyDeposit) {
		this.monthlyDeposit = monthlyDeposit;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTotalInput() {
		return totalInput;
	}

	public void setTotalInput(int totalInput) {
		this.totalInput = totalInput;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountnumber == null) ? 0 : accountnumber.hashCode());
		result = prime * result + accountperiod;
		result = prime * result + interest;
		long temp;
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + monthlyDeposit;
		result = prime * result + total;
		result = prime * result + totalInput;
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
		Savings other = (Savings) obj;
		if (accountnumber == null) {
			if (other.accountnumber != null)
				return false;
		} else if (!accountnumber.equals(other.accountnumber))
			return false;
		if (accountperiod != other.accountperiod)
			return false;
		if (interest != other.interest)
			return false;
		if (Double.doubleToLongBits(interestRate) != Double.doubleToLongBits(other.interestRate))
			return false;
		if (monthlyDeposit != other.monthlyDeposit)
			return false;
		if (total != other.total)
			return false;
		if (totalInput != other.totalInput)
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
		return "Savings [accountnumber=" + accountnumber + ", username=" + username + ", accountperiod=" + accountperiod
				+ ", monthlyDeposit=" + monthlyDeposit + ", interest=" + interest + ", interestRate=" + interestRate
				+ ", totalInput=" + totalInput + ", total=" + total + "]";
	}
	
}
