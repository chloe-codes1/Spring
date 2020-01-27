package com.mycompany.myapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;

/*
 * Emp Table���� emp �ڷḦ ó���� Class
 * 
 */

public class EmpServiceImpl implements EmpService{

	//Ȯ��� ���ɼ��� ������ EmpService�� implements�� class�� ����°� ������, ���⼱ �׳� ����!
	
//	private DBConnection db;
	// -> ���������� ���� ������ �� instance�� ����ؼ� �� ���ɼ��� �ֱ� ������ ���⿡���� ������������ ���������� ����ϴ°� ����!
	//    => local variable�� ����� ��� ���� ������ �ؾ� �ϴϱ�! 
	
	private PreparedStatement pStmt;
	
	//sql�� ���ÿ� ���������� �����ϱ� ���������� ����
	String sql;
	
	
	@Override
	public List<Emp> getEmpList() {
		
		
		sql = "select empno, ename, job, mgr from emp order by sal desc";
		ResultSet rs = null;
		
		try {
			pStmt =  DBConnection.dbCon.getPreparedStatement(sql);
			
			rs = pStmt.executeQuery();
			// -> .execute�� boolean 
			//    => ���⼱ true/false�� �ʿ��Ѱ� �ƴ϶� �������� list�� �ʿ��ϹǷ� executeQuery ����
			
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
			//SQLException�� �߻��� �� �����Ƿ�, Exception���� �ѹ��� catch ���� ���� ����ȭ�ϱ�
			System.err.println("EmpServiceImpl - getEmpList() => " + e.getSQLState());;
		} catch (Exception e) {
			System.out.println("EmpServiceImpl - getEmpList() => " + e.getMessage());
		}
		
		return null;
		//-> null�� ���ָ� ������ ������ ��, return �ϴ� ������ 
		//   exception �߻� �� null�� �ް�
		//   exception �߻� ���� ������ list�� ������ �ǹǷ� Ȯ���ϱ� ����!
	}

}



