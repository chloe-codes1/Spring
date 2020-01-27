package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

/**
 * 
 * @author user emp table에서 emp 자료를 처리할 클래스
 *
 */
public class EmpServiceImpl implements EmpService {

	// private DBConnection db;
	private PreparedStatement pStmt;
	private String sql;

	@Override
	public List<Emp> getEmpList() {

		sql = "select empNo, eName, job, mgr from emp";
		ResultSet rs = null;

		try {

			pStmt = DBConnection.dbCon.getPreparedStatement(sql);
			rs = pStmt.executeQuery();

			List<Emp> list = new ArrayList<Emp>();

			while (rs.next()) {
				Emp tempEmp = new Emp();
				tempEmp.setEmpNo(rs.getInt(1));
				tempEmp.seteName(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));

				list.add(tempEmp);
			}

			return list;

		} catch (SQLException e) {
			System.out.println("EmpServiceImpl.getEmpList() " + e.getSQLState());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	@Override
	public Emp getEmp(int empNo) {

		sql = "select empNo, eName, job, mgr from emp where empNo=?";
		ResultSet rs = null;

		try {

			pStmt = DBConnection.dbCon.getPreparedStatement(sql);
			pStmt.setInt(1, empNo);
			rs = pStmt.executeQuery();

			Emp tempEmp = new Emp();
			if (rs.next()) {
				tempEmp.setEmpNo(rs.getInt(1));
				tempEmp.seteName(rs.getString(2));
				tempEmp.setJob(rs.getString(3));
				tempEmp.setMgr(rs.getInt(4));
			}
			return tempEmp;

		} catch (SQLException e) {
			System.out.println("EmpServiceImpl.getEmp() " + e.getSQLState() + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public int updateEmp(String eName, String job, int mgr, int empNo) {
		
		sql = "update emp set eName=?, job=?, mgr=? where empNo=?";
		int result = 0;

		try {

			pStmt = DBConnection.dbCon.getPreparedStatement(sql);
			pStmt.setString(1, eName);
			pStmt.setString(2, job);
			pStmt.setInt(3, mgr);
			pStmt.setInt(4, empNo);
			
			result = pStmt.executeUpdate();


		} catch (SQLException e) {
			System.out.println("EmpServiceImpl.updateEmp() " + e.getSQLState() + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

}
