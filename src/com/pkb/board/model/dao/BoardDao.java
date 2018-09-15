package com.pkb.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import static com.pkb.common.JDBCTemplate.*;

import com.pkb.board.model.vo.Board;

public class BoardDao {
	private Properties prop = new Properties();
	
	//1:1문의 등록 메소드
	public int insertOnebyOneQna(Connection con, Board b) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertOnebyOneQna");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, b.getUser_no());
			pstmt.setString(2, b.getArticle_title());
			pstmt.setString(3, b.getArticle_contents());
			
			
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		
		
		return result;
	}

}
