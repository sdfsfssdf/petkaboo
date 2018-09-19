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
			
			//나중에 로그인 세션 되면 추가! pstmt.setInt(1, b.getUser_no());
			pstmt.setString(1, b.getArticle_title());
			pstmt.setString(2, b.getArticle_contents());
			
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		
		
		return result;
	}
	
	//목록 전체 조회
	public ArrayList<Board> selectOnebyOneList(Connection con, int currentPage, int limit) {
		
		Board b = null;
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
			
			while(rset.next()){
				b = new Board();
				
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
			
			System.out.println("dao : " + list);
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
			
		}
		
		
		return list;
	}
	
	//목록 수 조회
	public int getOnebyOneListCount(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("OnebyOneListCount");
		
		int oneByOneListCount = 0;
		
		try {
			stmt = con.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()){
				oneByOneListCount = rset.getInt(1);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
			
		}
		
		return oneByOneListCount;
	}
	
	//상세 조회!
	public Board selectOneOnebyOne(Connection con, int num) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Board b = null;
		
		
		String query = prop.getProperty("selectOneOnebyOne");
		
		try {

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, num);
			
			rset = pstmt.executeQuery();
			
		
			
			if(rset.next()){
				
				b = new Board();
				
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
			
				
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);	
	
		}
		
		
		return b;
		
	}
	
	
	/*public int updateOnebyOneCount(Connection con, int num) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateOnebyOneCount");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, num);
			pstmt.setInt(2, num);
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally{
			close(pstmt);
		
			
		}
		
		
		return result;
	}*/

	

}
