package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oracle.net.aso.p;

/*
 * jdbc connection이 들어갈꺼야
 */

public class DBConnection {

	private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);
	public final static DBConnection dbCon;
	// get이 있으면 굳이 이렇게 public static 할 필요 없음
	// 외부에서 쓸 일 없으면 private으로 해도 된다!
	// -> static인 이유는 이 class안에서 쓸려구~
	// -> static block이 아래에 있기 때문에 public final한데 data 없어도 (초기값 설정 안해도) 에러 없음!
	//     => final이라 갱신 불가!
	
	private static Connection conn;
	private static PreparedStatement pStmt;
	
	
	private DBConnection() {
		// 이렇게하면 자기 class가 아닌 외부에서 instance를 만들 수 없음 -> new DBConnection 불가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");

			logger.info("DB Connection succeed");

			//autoCommit 설정 자리
			// -> autoCommit을 true로 하면 잘못 했을때 commit 되어서 rollback 여지가 없어지므로 신중하게 true로 하세요!!
			
			
		} catch (ClassNotFoundException e) {
			logger.info("Connection Failed => " + e.getMessage());
		} catch (Exception e) {
			logger.info("Connection Failed => " + e.getMessage());
		}
	}

	// Static한 Block
	static {
		dbCon = new DBConnection();
	}

	/*
	 * 이것은 무용지물인 method가 되었음 이유가 뭘까??? 하하하
	 */
	public static DBConnection getDBConnection() {
		
		return dbCon;
		// -> 이렇게 하면 singleton
	}
	
	public static Connection getConnection() {
		//static한 method안에서 static 하지 않은 variable을 사용 할 수 없다
		// -> why? static하지 않은 variable conn은 아직 memory에 load 되지 않아서! (이땐 static 안붙임) 
		
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
