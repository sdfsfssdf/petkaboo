package com.pkb.board.model.dao;

import static com.pkb.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
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
	
	
	public BoardDao(){
		String fileName = BoardDao.class.getResource("/sql/board/board-query.properties").getPath();
		
		try{
			prop.load(new FileReader(fileName));
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
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
			int startRow = (currentPage - 1) * limit + 1;
			int endRow = startRow + limit - 1;
		
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Board>();
			
			System.out.println(list);
			
			while(rset.next()){
				Board b = new Board();
				
				b.setArticle_no(rset.getInt("article_no"));
				b.setUser_no(rset.getInt("user_no"));
				b.setArticle_date(rset.getDate("article_date"));
				b.setArticle_title(rset.getString("article_title"));
				b.setArticle_contents(rset.getString("article_contents"));
				b.setArticle_type(rset.getString("article_type"));
				b.setArticle_lv(rset.getInt("article_lv"));
				b.setContract_no(rset.getInt("contract_no"));
				b.setArticle_status(rset.getInt("article_status"));
				b.setArticle_refno(rset.getInt("article_refno"));
				b.setArticle_modify_date(rset.getDate("article_modify_date"));
				
				list.add(b);
				
			}
			
			System.out.println("dao는? : " + list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(pstmt);
			close(rset);
		}
		
		
		
		return list;
	}
	

}
