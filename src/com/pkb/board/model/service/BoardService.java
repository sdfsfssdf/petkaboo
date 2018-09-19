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
		
		close(con);
		
		return result;
	}

	public ArrayList<Board> selectOnebyOneList(int currentPage, int limit) {
		
		Connection con = getConnection();
		
		ArrayList<Board> list = new BoardDao().selectOnebyOneList(con, currentPage, limit);
		
		return list;
	}

	public int getOnebyOneListCount() {
		Connection con = getConnection();
		
		int oneByOneListCount = new BoardDao().getOnebyOneListCount(con);
		
		close(con);
		
		return oneByOneListCount;
	}

	public Board selectOneOnebyOne(int num) {
		Connection con = getConnection();
		
		Board b = null;
		
		
		/*int result = new BoardDao().updateOnebyOneCount(con, num);*/
		
		
		
		return null;
	}

	
}
