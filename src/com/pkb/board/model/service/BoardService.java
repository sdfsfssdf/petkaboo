package com.pkb.board.model.service;

import static com.pkb.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.pkb.board.model.dao.BoardDao;
import com.pkb.board.model.vo.Board;

public class BoardService {

	//1:1문의 등록 메소드
	public int insertOnebyOneQna(Board b) {
	
		Connection con = getConnection();
		
		int result = new BoardDao().insertOnebyOneQna(con, b);
		
		if(result > 0){
			commit(con);
			
		}else{
			rollback(con);
			
		}
		
		return result;
	}

	public ArrayList<Board> selectOnebyOneList(int currentPage, int limit) {
		Connection con = getConnection();
		
		ArrayList<Board> list = new BoardDao().selectOnebyOneList(con, currentPage, limit);
		
		close(con);
		
		return list;
	}

	//1:1문의 게시물 수 조회용 메소드
	public int getOnebyOneListCount() {
		Connection con = getConnection();
		
		int listCount = new BoardDao().getOnebyOneListCount(con);
		
		close(con);
		
		return listCount;
	}

}
