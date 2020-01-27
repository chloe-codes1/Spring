package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

/*
 * Emp Table에서 emp 자료를 처리할 Class
 * 
 */

public class EmpServiceImpl implements EmpService{

	//확장될 가능성이 있으면 EmpService를 implements한 class를 만드는게 좋지만, 여기선 그냥 안함!
	
//	private DBConnection db;
	// -> 전역변수로 만든 이유는 이 instance를 계속해서 쓸 가능성이 있기 때문에 여기에서는 지역변수보다 전역변수로 사용하는게 좋음!
	//    => local variable로 만들면 계속 변수 선언을 해야 하니까! 
	
	private PreparedStatement pStmt;
	
	//sql을 동시에 실행하지는 않으니까 전역변수로 뺐음
	String sql;
	
	
	@Override
	public List<Emp> getEmpList() {
		
		
		sql = "select empno, ename, job, mgr from emp order by sal desc";
		ResultSet rs = null;
		
		try {
			pStmt =  DBConnection.dbCon.getPreparedStatement(sql);
			
			rs = pStmt.executeQuery();
			// -> .execute면 boolean 
			//    => 여기선 true/false만 필요한게 아니라 실질적인 list가 필요하므로 executeQuery 쓴다
			
			List<Emp> list = new ArrayList<Emp>();
			
			while(rs.next()) {
				Emp tempEmp = new Emp();
				tempEmp.setEmpNo(rs.getInt(1));
				tempEmp.seteName(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
				
				list.add(tempEmp);
			}
			return list;
		} catch (SQLException e) {
			//SQLException이 발생할 수 있으므로, Exception으로 한번에 catch 하지 말고 세분화하기
			System.err.println("EmpServiceImpl - getEmpList() => " + e.getSQLState());;
		} catch (Exception e) {
			System.out.println("EmpServiceImpl - getEmpList() => " + e.getMessage());
		}
		
		return null;
		//-> null로 해주면 문제가 생겼을 시, return 하는 곳에서 
		//   exception 발생 시 null을 받고
		//   exception 발생 하지 않으면 list를 받으면 되므로 확인하기 좋음!
	}

}



