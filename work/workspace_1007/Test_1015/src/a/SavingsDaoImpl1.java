package a;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SavingsDaoImpl1 implements SavingsDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){ 
		this.jdbcTemplate =jdbcTemplate; 
		} 
	

	@Override
	public List<Savings> findSavingList() {
		
		//String sql ="select accountnumber, monthlydeposit, total, username from savings "; 
		String sql ="SELECT*FROM SAVINGS ORDER BY ACCOUNTNUMBER "; 
		SavingsRowMapper rowMapper =new SavingsRowMapper(); 
		List<Savings> savingsList =jdbcTemplate.query(sql, rowMapper);
		return savingsList;
	}
	
}
