package com.pkb.member.model.service;

import static com.pkb.common.JDBCTemplate.*;

import java.sql.Connection;

import com.pkb.member.model.dao.UserDAO;

public class FileService {

	public int insertIdentify(com.pkb.member.model.vo.File f) {
		Connection con = getConnection();
		
		int result = new UserDAO().insertIdentify(con, f);
		
		if(result>0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		
		return result;
	}

	public int InsertProfile(com.pkb.member.model.vo.File f) {
		Connection con = getConnection();
		
		int profileResult = new UserDAO().insertProfile(con, f);
		
		if(profileResult > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		return profileResult;
	}

	public int insertLicense(com.pkb.member.model.vo.File f) {
		Connection con = getConnection();
		
		int licenseResult = new UserDAO().insertLicense(con, f);
		
		if(licenseResult > 0){
			commit(con);
		}else{
			rollback(con);
		}
		close(con);
		return licenseResult;
	}
	
}
