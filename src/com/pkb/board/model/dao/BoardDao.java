package com.pkb.board.model.dao;

import static com.pkb.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

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
			
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		
		
		return result;
	}

	//DB에서 1:1문의 글 게시글 수 가져오기
	public int getOnebyOneListCount(Connection con) {
		
		
		Statement stmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("listCount");
		
		int listCount = 0;
		
		try{
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			
			if(rset.next()){
				listCount = rset.getInt(1);
				
			}
			
			
			
		} catch(SQLException e) {
			
			
		} finally {
			close(stmt);
			close(rset);
			
		}
		
		return listCount;
	}

	//1:1문의 목록 DB에서 조회
	public ArrayList<Board> selectOnebyOneList(Connection con, int currentPage, int limit) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Board> list = null;
		
		String query = prop.getProperty("selectOnebyOneList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(arg0, arg1);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	

}
