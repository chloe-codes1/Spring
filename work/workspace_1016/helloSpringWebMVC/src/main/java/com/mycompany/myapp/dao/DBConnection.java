package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oracle.net.aso.p;

/*
 * jdbc connection�� ������
 */

public class DBConnection {

	private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);
	public final static DBConnection dbCon;
	// get�� ������ ���� �̷��� public static �� �ʿ� ����
	// �ܺο��� �� �� ������ private���� �ص� �ȴ�!
	// -> static�� ������ �� class�ȿ��� ������~
	// -> static block�� �Ʒ��� �ֱ� ������ public final�ѵ� data ��� (�ʱⰪ ���� ���ص�) ���� ����!
	//     => final�̶� ���� �Ұ�!
	
	private static Connection conn;
	private static PreparedStatement pStmt;
	
	
	private DBConnection() {
		// �̷����ϸ� �ڱ� class�� �ƴ� �ܺο��� instance�� ���� �� ���� -> new DBConnection �Ұ�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");

			logger.info("DB Connection succeed");

			//autoCommit ���� �ڸ�
			// -> autoCommit�� true�� �ϸ� �߸� ������ commit �Ǿ rollback ������ �������Ƿ� �����ϰ� true�� �ϼ���!!
			
			
		} catch (ClassNotFoundException e) {
			logger.info("Connection Failed => " + e.getMessage());
		} catch (Exception e) {
			logger.info("Connection Failed => " + e.getMessage());
		}
	}

	// Static�� Block
	static {
		dbCon = new DBConnection();
	}

	/*
	 * �̰��� ���������� method�� �Ǿ��� ������ ����??? ������
	 */
	public static DBConnection getDBConnection() {
		
		return dbCon;
		// -> �̷��� �ϸ� singleton
	}
	
	public static Connection getConnection() {
		//static�� method�ȿ��� static ���� ���� variable�� ��� �� �� ����
		// -> why? static���� ���� variable conn�� ���� memory�� load ���� �ʾƼ�! (�̶� static �Ⱥ���) 
		
		return conn;
	}
	
	
	public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
		pStmt = conn.prepareStatement(sql);
		
		return pStmt;
	}
	
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		if (conn != null) {
			if (conn.isClosed()) {
				conn.close();
			}
			conn = null;
		}
		super.finalize();
	}
}
