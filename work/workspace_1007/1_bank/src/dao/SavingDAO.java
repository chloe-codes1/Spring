package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.SavingVO;

public class SavingDAO {

	public String openAccount(SavingVO vo) {

		String sql = "insert into savings(accountNumber, username, accountPeriod, monthlyDeposit, interest, interestRate, totalInput, total)"
				+ " values('1-100'|| saving_seq.nextval, ?, ?, ?, ?, DEFAULT,?,?)";

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		ResultSet rs=null;
		
		String accountNumber=null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql,new String[] {"accountNumber"});
			ps.setString(1, vo.getUsername());
			ps.setInt(2, vo.getAccountPeriod());
			ps.setInt(3, vo.getMonthlyDeposit());
			ps.setInt(4, vo.getInterest());
			ps.setInt(5, vo.getTotalInput());
			ps.setInt(6, vo.getTotal());

			result = ps.executeUpdate();
			rs=ps.getGeneratedKeys();
			while(rs.next()) {
				accountNumber=rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return accountNumber;
	}

	
public List<SavingVO> savingsearch(String accountNumber, String username){
		
		String sql = "select * from savings where accountnumber=? AND username =? ";
		System.out.println("savings search 완료");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<SavingVO> list = new ArrayList<SavingVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, accountNumber);
			ps.setString(2, username);
			
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new SavingVO(rs.getString("accountNumber"), 
										rs.getString("username"), 
										rs.getInt("accountPeriod"),
										rs.getInt("monthlyDeposit"), 
										rs.getDouble("interestRate"), 
										rs.getInt("interest"),
										rs.getInt("totalInput"), 
										rs.getInt("total")
										));
				System.out.println(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}
}