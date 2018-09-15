package com.pkb.board.model.service;

import static com.pkb.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.pkb.board.model.dao.BoardDao;
import com.pkb.board.model.vo.Board;

public class BoardService {

	//1:1문의 등록 메소드
	public int insertOnebyOneQna(Board b) {
	
		Connection con = getConnection();
		
		int result = new BoardDao().insertOnebyOneQna(con, b);
		
		return 0;
	}

}
