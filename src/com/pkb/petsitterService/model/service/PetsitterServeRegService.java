package com.pkb.petsitterService.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.commit;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pkb.petsitterService.model.dao.PetsitterServiceDao;
import com.pkb.petsitterService.model.vo.PetsitterServiceData;

public class PetsitterServeRegService {

	// 서블릿에서 받아온 펫시터 서비스 기본 등록 데이터를 처리
	public int insertPetsitterService(PetsitterServiceData psd) {
		Connection con = getConnection();
		
		int result = new PetsitterServiceDao().insertPetsitterService(con, psd);
		
		if(result > 0){
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

}
