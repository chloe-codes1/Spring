package a;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class SavingsRowMapper implements RowMapper<Savings>{
	
	
	public Savings mapRow(ResultSet rs,int rowNum) throws SQLException{ 
		Savings savings =new Savings(); 
		
		savings.setAccountnumber(rs.getString("ACCOUNTNUMBER")); 
		savings.setUsername(rs.getString("USERNAME")); 
		savings.setAccountperiod(rs.getInt("ACCOUNTPERIOD")); 
		savings.setMonthlyDeposit(rs.getInt("MONTHLYDEPOSIT")); 
		savings.setInterest(rs.getInt("INTEREST"));
		savings.setInterestRate(rs.getInt("INTERESTRATE"));
		savings.setTotalInput(rs.getInt("TOTALINPUT"));
		savings.setTotal(rs.getInt("TOTAL"));
		
		return savings; 
	}
		
}
