package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author user
 * jdbc connection
 *
 */
public class DBConnection {
	
	private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);
	public final static DBConnection dbCon;  //외부에서 갱신할 수 있으면 안되므로 final로 선언해줌.
	private static Connection conn;
	private PreparedStatement pStmt;
	
	
	private DBConnection() { 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");
			
			logger.info("DB Connection true!!!!");
			
			//autoCommit 설정 자리 =>  conn.setAutoCommit(true);  ==> 기본값이 true임.
			
			
		} catch (Exception e) {
			logger.error("Connection Fail  => " + e.getMessage());
		}
	}
	
	static {
		dbCon = new DBConnection();
	}
	
	
	/**
	 * 무용지물인 메소드가 됨. 
	 * public final static DBConnection dbCon; 으로 선언했기 때문에
	 * get이 필요 없음.
	 * @return
	 */
	public static DBConnection getDbConnection() {
		return dbCon;
	}
	
	
	public static Connection getConnection() {  //static 메소드에서 non-static 변수에 접근 불가하므로 conn을 static 으로 선언.
		return conn;
	}
	
	
	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		
		pStmt = conn.prepareStatement(sql);
		
		return pStmt;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		if(conn!=null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
		super.finalize();
	}

}
