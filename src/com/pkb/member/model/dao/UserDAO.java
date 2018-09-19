package com.pkb.member.model.dao;

import static com.pkb.common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.pkb.member.model.vo.File;
import com.pkb.member.model.vo.User;

public class UserDAO {

	private Properties prop = new Properties();
	
	public UserDAO(){
		String fileName = UserDAO.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public User loginCheck(Connection con, String email, String user_pwd){
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User loginUser = null;
		
		String query = prop.getProperty("loginUser");
		try{
			pstmt= con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, user_pwd);
			rset=pstmt.executeQuery();
			System.out.println("하이");
			if(rset.next()){
				loginUser = new User();
				System.out.println("들어오니?");
				loginUser.setUser_no(rset.getInt("user_no"));
				loginUser.setEmail(rset.getString("email"));
				loginUser.setUser_pwd(rset.getString("user_pwd"));
				loginUser.setUser_type(rset.getInt("user_type"));
				loginUser.setUser_name(rset.getString("user_name"));
				loginUser.setPhone(rset.getString("phone"));
				loginUser.setBirthday(rset.getDate("birthday"));
				loginUser.setGender(rset.getString("gender"));
				loginUser.setAddress(rset.getString("address"));
				loginUser.setSms_chk(rset.getString("sms_chk"));
				loginUser.setEmail_chk(rset.getString("email_chk"));
				loginUser.setEnrollDate(rset.getDate("enrolldate"));
				loginUser.setNickname(rset.getString("nickname"));
				loginUser.setUser_grade(rset.getInt("user_grade"));
				loginUser.setPet_auth(rset.getString("pet_auth"));
				loginUser.setUser_status(rset.getInt("user_status"));
				loginUser.setFile_no(rset.getInt("file_no"));
				loginUser.setEmail_hash(rset.getString("email_hash"));
				loginUser.setArticle_no(rset.getInt("article_no"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(pstmt);
			close(rset);
		}
		return loginUser;
	}

	public int joinUser(Connection con, User u) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("joinUser");
		System.out.println("들어왔지?");
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, u.getEmail());
			pstmt.setString(2, u.getUser_pwd());
			pstmt.setString(3, u.getEmail_hash());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		System.out.println("숫자는?"+result);
		return result;
	}

	public int mailAuth(Connection con, String email) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("setAuth");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int chageAdd(Connection con, User loginUser) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		String query = prop.getProperty("changeAdd");
		System.out.println("change" + loginUser.getAddress());
		System.out.println("email" + loginUser.getEmail());
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, loginUser.getAddress());
			pstmt.setString(2, loginUser.getEmail());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int checkId(Connection con, String email) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		String query = prop.getProperty("checkEmail");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			rset= pstmt.executeQuery();
			
			if(rset.next()){
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
			close(rset);
		}
		return result;
	}

	public int checkPwd(Connection con, String currentPwd, String email) {
		PreparedStatement pstmt = null;
		int result = 0 ;
		String query = prop.getProperty("checkPwd");
		
		System.out.println("DAO"+email);
		System.out.println(currentPwd);
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, currentPwd);
			pstmt.setString(2, email);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int changePwd(Connection con, String newPwd, String email) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("changePwd");
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, newPwd);
			pstmt.setString(2, email);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int changeNickname(Connection con, String nickname, String email) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("changeNickname");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nickname);
			pstmt.setString(2, email);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int insertIdentify(Connection con, File f) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("insertIdentify");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, f.getFile_name());
			pstmt.setInt(2, f.getUser_no());
			pstmt.setString(3, f.getFile_path());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}

	public int insertProfile(Connection con, File f) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("insertProfile");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, f.getFile_name());
			pstmt.setInt(2, f.getUser_no());
			pstmt.setString(3, f.getFile_path());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(pstmt);
		}
		return result;
	}
	
}
