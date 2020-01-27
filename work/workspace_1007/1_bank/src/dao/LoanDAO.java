package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.LoanVO;

public class LoanDAO {

	public int openAccount(LoanVO vo) {
		
		String sql = "insert into loan(accountNumber, username, accountPeriod, loan, interest, interestRate, monthlyRA)"
		           + "  values('2-100' || loan_seq.nextval, ?, ?, ?, ?,DEFAULT, ?)";

	Connection con = null;
	PreparedStatement ps = null;
	int result = 0;

	try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);

		ps.setString(1, vo.getUsername());
		ps.setInt(2, vo.getAccountPeriod());
		ps.setInt(3, vo.getLoan());
		ps.setInt(4, vo.getInterest());
		ps.setInt(5, vo.getMonthlyRA());
		
		result = ps.executeUpdate();

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		JDBCUtil.close(con, ps, null);
	}
	return result;
		
	}
	
public List<LoanVO> loansearch(String accountNumber, String username){
		
		String sql = "select * from loan where accountnumber=? AND username =? ";
		System.out.println("loan search 완료");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<LoanVO> list = new ArrayList<LoanVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, accountNumber);
			ps.setString(2, username);
			
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new LoanVO(rs.getString("accountNumber"), 
										rs.getString("username"), 
										rs.getInt("accountPeriod"),
										rs.getInt("loan"),
										rs.getInt("interest"), 
										rs.getDouble("interestRate"), 
										rs.getInt("MonthlyRA")
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
