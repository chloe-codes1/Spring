package vo;

public class LoanVO extends AccountVO{

	String accountNumber;
    int loan;
    int interest;
    double interestRate;
    int monthlyRA;
    
    public LoanVO() {}

	public LoanVO(String accountNumber, String username, int accountPeriod, int loan, int interest, double interestRate, int monthlyRA) {
		super();
		
		super.username = username;
		super.accountPeriod = accountPeriod;
		
		this.accountNumber = accountNumber;
		this.loan = loan;
		this.interest = interest;
		this.interestRate = interestRate;
		this.monthlyRA = monthlyRA;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getLoan() {
		return loan;
	}

	public void setLoan(int loan) {
		this.loan = loan;
	}

	public int getInterest() {
		return (int)(getLoan()*getInterestRate()/12/100);
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

	public int getMonthlyRA() {
		int a = getLoan();
		double b = getInterestRate()/12;
		int n = getAccountPeriod();
		return (int) (((a*b*Math.pow(1+b,n))/(Math.pow(1+b,n)-1)))/getAccountPeriod();
	}

	public void setMonthlyRA(int monthlyRA) {
		this.monthlyRA = monthlyRA;
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
		result = prime * result + loan;
		result = prime * result + monthlyRA;
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
		LoanVO other = (LoanVO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (interest != other.interest)
			return false;
		if (Double.doubleToLongBits(interestRate) != Double.doubleToLongBits(other.interestRate))
			return false;
		if (loan != other.loan)
			return false;
		if (monthlyRA != other.monthlyRA)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoanVO [accountNumber=" + accountNumber + ", loan=" + loan + ", interest=" + interest + ", intestRate="
				+ interestRate + ", monthlyRA=" + monthlyRA + ", username=" + username + ", accountPeriod="
				+ accountPeriod + "]";
	}
   
}
