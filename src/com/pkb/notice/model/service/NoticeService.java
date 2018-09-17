package com.pkb.notice.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.commit;
import static com.pkb.common.JDBCTemplate.getConnection;
import static com.pkb.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pkb.notice.model.dao.NoticeDao;
import com.pkb.notice.model.vo.Notice;
public class NoticeService {

	public int insertNotice(Notice nt) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		
		int result = new NoticeDao().insertNotice(con, nt);
		
		if(result > 0){
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

	public ArrayList<Notice> selectNoticeList(int currentPage, int limit) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		
		ArrayList<Notice> list = new NoticeDao().selectNoticeList(con,currentPage,limit);
		
		close(con);
		
		return list;
	}

	public int getListCount() {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		
		int result = new NoticeDao().getListCount(con);

		close(con);
		
		return result;
	}

}
