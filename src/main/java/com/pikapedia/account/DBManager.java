package com.pikapedia.account;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// db관련 작업을 할때 연결코드를 쓴 이후에 작업 해옴
// 다 쓰면 닫음

// 그걸 AOP 하자
public class DBManager {
	
	
	// db 작업시엔 어쨋든 연결 해야됨
	static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@j3ztyaovkh9aoawj_high?TNS_ADMIN=C:/HJP/Wallet_J3ZTYAOVKH9AOAWJ";
		Connection con = DriverManager.getConnection(url, "ADMIN", "Soldesk802!!");		
		System.out.println("연결 성공!");
		return DriverManager.getConnection(url, "ADMIN", "Soldesk802!!");
	}
	
	//닫을게 많은데 한번에 닫기
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
				
		if (rs!= null) {
		
			rs.close();
		}
		pstmt.close();
		
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
