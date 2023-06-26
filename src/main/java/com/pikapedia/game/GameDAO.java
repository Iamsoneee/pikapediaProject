package com.pikapedia.game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import com.pikapedia.db.DBManager;
import com.pikapedia.db.Pokemon;
import com.pikapedia.detail.DetailPokeBean;

public class GameDAO {

	public static void random(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT *FROM POKEMON_KO WHERE P_NO =?";
		Random random = new Random();
		int randomNumber = random.nextInt(151) + 1;
		
		try {
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, randomNumber);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int p_no = rs.getInt("p_no");
				String p_name = rs.getString("p_name");
				String p_frontDefault = rs.getString("p_front_default");
				
				DetailPokeBean pokemon = new DetailPokeBean(p_no, p_name, 0, 0, "", "", "", p_frontDefault, "", "", "");
				
				request.setAttribute("poketmon", pokemon);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
	}

	public static int insertDDibu(HttpServletRequest request) {
	    
	      Connection con = null;
	      PreparedStatement pstmt = null;

	      String id = request.getParameter("id");
	      String pkno = request.getParameter("pkno");
		  String sql = "insert into reward values(?,?)";
	      try {
	    	con = DBManager.connect();
	    	
	    		pstmt = con.prepareStatement(sql);
	    		
	    		pstmt.setString(1, pkno);
	    		pstmt.setString(2, id);

			if(pstmt.executeUpdate()==1) {
				System.out.println("등록 성공");
				return 1;
			}
	        	
	      } catch (Exception e) {
				System.out.println("db 실패");
				e.printStackTrace();
				return 0;
	      } finally {
	      	DBManager.close(con, pstmt, null);
	      }
		return 0;
	}
}
