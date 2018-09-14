package com.pkb.member.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.commit;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pkb.member.model.dao.UserDAO;
import com.pkb.member.model.vo.User;
import com.pkb.member.util.SHA256;


public class UserService {

	public User loginCheck(String email, String user_pwd) {
		Connection con = getConnection();
		
		User loginUser = new UserDAO().loginCheck(con, email, user_pwd);
		
		if(loginUser != null){
			commit(con);
		}else{
			rollback(con);
		}
		
		return loginUser;
	}

	public int joinUser(User u) {
		Connection con = getConnection();
		
		int result = new UserDAO().joinUser(con, u);
		
		System.out.println();
		if(result>0){
			commit(con);
			
		}else{
			rollback(con);
		}
		close(con);
		
		return result;
	}
	

	public int mailAuth(String email, String code) {
		Connection con = getConnection();
		int result = 0;
		
		if(SHA256.getSHA256(email).equals(code)){
			result = new UserDAO().mailAuth(con, email);
		}else{
			result = 0;
		}
		
		if(result>0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		return result;
	}}
