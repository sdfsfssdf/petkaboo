package com.pkb.petsitterService.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.commit;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pkb.petsitterService.model.dao.PetsitterServiceDao;
import com.pkb.petsitterService.model.dao.PetsitterServiceDetailDao;
import com.pkb.petsitterService.model.vo.Petsitter;
import com.pkb.petsitterService.model.vo.PetsitterServiceData;
import com.pkb.petsitterService.model.vo.PetsitterServiceDataDetail;

public class PetsitterServeRegService {

	// 서블릿에서 받아온 펫시터 서비스 기본 등록 데이터를 처리
	public int insertPetsitterService(PetsitterServiceData psd, PetsitterServiceDataDetail psdDetail) {
		Connection con = getConnection();
		int result = 0;
		
		int psdResult = new PetsitterServiceDao().insertPetsitterService(con, psd);
		
		if(psdResult > 0){
			// 펫시터 기본 서비스 데이터 삽입 성공시
			int psdDetailResult = new PetsitterServiceDetailDao().insertPetsitterServiceDetail(con, psdDetail);
			
			if(psdDetailResult > 0){
				// 펫시터 상세 서비스 데이터 삽입 성공시
				commit(con);
				result = psdResult + psdDetailResult;
			}else{
				// 아니라면
				rollback(con);
			}
			
		}else{
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public int getListCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Petsitter> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		
		ArrayList<Petsitter> list = new PetsitterServiceDao().selectList(con, currentPage, limit);
		
		close(con);
		
		return list;
	}

}
