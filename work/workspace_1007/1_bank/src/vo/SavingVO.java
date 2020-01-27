package vo;

public class SavingVO extends AccountVO{
	
    String accountNumber;
    int monthlyDeposit;
    double interestRate;
    int interest;
    int totalInput;
    int total;
    
    public SavingVO() {}
	
	public SavingVO(String accountNumber, String username, int accountPeriod, int monthlyDeposit, double interestRate, int interest, int totalInput,
			int total) {
		super();

		super.username = username;
		super.accountPeriod = accountPeriod;
		
		this.accountNumber = accountNumber;
		this.monthlyDeposit = monthlyDeposit;
		this.interestRate = interestRate;
		this.interest = interest;
		this.totalInput = totalInput;
		this.total = total;
	}


	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getMonthlyDeposit() {
		return monthlyDeposit;
	}

	public void setMonthlyDeposit(int monthlyDeposit) {
		this.monthlyDeposit = monthlyDeposit;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public int getInterest() {
		return (int)(getTotalInput()*getInterestRate())/100;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public int getTotalInput() {
		
		return getMonthlyDeposit()*getAccountPeriod();
	}

	public void setTotalInput(int totalInput) {
		this.totalInput = totalInput;
	}

	public int getTotal() {
		return getTotalInput() + getInterest();
	}

	public void setTotal(int total) {
		this.total = total;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + interest;
		long temp;
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + monthlyDeposit;
		result = prime * result + total;
		result = prime * result + totalInput;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingVO other = (SavingVO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
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
		return true;
	}


	@Override
	public String toString() {
		return "SavingVO [accountNumber=" + accountNumber + ", monthlyDeposit=" + monthlyDeposit + ", interestRate="
				+ interestRate + ", interest=" + interest + ", totalInput=" + totalInput + ", total=" + total
				+ ", username=" + username + ", accountPeriod=" + accountPeriod + "]";
	}


}
