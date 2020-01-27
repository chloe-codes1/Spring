package a;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;



public class SavingsDaoImpl2 extends JdbcDaoSupport implements SavingsDao{


	@Override
	public List<Savings> findSavingList() {
		String sql ="select * from savings ORDER BY USERNAME"; 
		SavingsRowMapper rowMapper =new SavingsRowMapper(); 
		List<Savings> savingsList = getJdbcTemplate().query(sql, rowMapper);
		return savingsList;
	}
	
}
