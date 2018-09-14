package com.pkb.petsitterService.model.dao;

import static com.pkb.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.pkb.petsitterService.model.vo.PetsitterServiceDataDetail;

public class PetsitterServiceDetailDao {
	private Properties prop = new Properties();

	public PetsitterServiceDetailDao(){
		String fileName = PetsitterServiceDetailDao.class.getResource("/sql/member/member-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public int insertPetsitterServiceDetail(Connection con, PetsitterServiceDataDetail psdDetail) {
		PreparedStatement pstmt = null;
		int result  = 0;
		
		String query = prop.getProperty("insertPetsitterServiceDetail");
		System.out.println(psdDetail);
		try {
			pstmt = con.prepareStatement(query);
			
			// psdDetail 객체의 정보 꺼내와서 쿼리문 완성
			pstmt.setInt(1, psdDetail.getPet_count());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}
