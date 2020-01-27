package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

public class LoginServiceImpl implements LoginService {

	private PreparedStatement pStmt;
	String sql;

	@Override
	public Emp getEmpno(int empNo, String eName) {

		sql = " select empno, ename, job, mgr from emp where empno = ? and lower(ename) = ?";

		ResultSet rs = null;
		Emp tempEmp = null;

		try {
			pStmt = DBConnection.dbCon.getPreparedStatement(sql);
			pStmt.setInt(1, empNo);
			pStmt.setString(2, eName.toLowerCase());
			rs = pStmt.executeQuery();

			if (rs.next()) {
				tempEmp = new Emp();
				tempEmp.setEmpNo(rs.getInt(1));
				tempEmp.seteName(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
				return tempEmp;
			}

		} catch (SQLException e) {
			// SQLException이 발생할 수 있으므로, Exception으로 한번에 catch 하지 말고 세분화하기
			System.err.println("LoginServiceImpl - getEmpno() => " + e.getMessage());
		} catch (Exception e) {
			System.out.println("LoginServiceImpl - getEmpno() => " + e.getMessage());
		}

		return null;

	}

}
