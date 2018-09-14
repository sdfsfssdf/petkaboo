package com.pkb.petsitterService.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.commit;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.pkb.petsitterService.model.dao.PetsitterServiceDetailDao;
import com.pkb.petsitterService.model.vo.PetsitterServiceDataDetail;

public class PetsitterServeDetailRegService {

	public int insertPetsitterServiceDetail(PetsitterServiceDataDetail psdDetail) {
		Connection con = getConnection();
		
		int result = new PetsitterServiceDetailDao().insertPetsitterServiceDetail(con, psdDetail);
		
		if(result > 0){
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

}
