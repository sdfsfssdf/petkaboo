package com.pkb.petsitterService.model.dao;

import static com.pkb.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.pkb.petsitterService.model.vo.PetsitterServiceData;

public class PetsitterServiceDao {
	private Properties prop = new Properties();
	
	public PetsitterServiceDao(){
		String fileName = PetsitterServiceDao.class.getResource("/sql/petsitterService/petsitterService-query.properties").getPath();

		try {
			
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public int insertPetsitterService(Connection con, PetsitterServiceData psd) {
		PreparedStatement pstmt = null;
		int result  = 0;
		
		String query = prop.getProperty("insertPetsitterService");
		System.out.println(psd);
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, psd.getUser_no());
			pstmt.setInt(2, Integer.parseInt(psd.getContract_type()));
			// 임시코드. 요일은 배열로 가져와 구분자 처리 후 넣어야 함
			pstmt.setString(3, psd.getContract_days());
			pstmt.setDate(4, psd.getContract_start());
			pstmt.setDate(5, psd.getContract_end());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}

}
