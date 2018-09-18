package com.pkb.commiAndAccount.model.service;

import static com.pkb.common.JDBCTemplate.*;
import static com.pkb.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.pkb.commiAndAccount.model.dao.CommiAndAccountDao;
import com.pkb.commiAndAccount.model.vo.Commission;
import com.pkb.commiAndAccount.model.vo.CommissionAndAccountList;
public class CommiAndAccountService {

	public CommissionAndAccountList selectCAAList() {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		
		CommissionAndAccountList caa = new CommiAndAccountDao().selectCommitonList(con);
		
		if(caa.getClist() != null){
			CommissionAndAccountList tempcaa = new CommiAndAccountDao().selectAccountList(con);
			
			if(tempcaa != null){
				caa.setAlist(tempcaa.getAlist());
			} else {
				caa = null;
			}
		}
		
		close(con);
		
		return caa;
	}

	public int[] modifyCommssion(ArrayList<Commission> clist) {
		Connection con = getConnection();
		
		int[] result = new CommiAndAccountDao().modifyCommssion(con,clist);
			
		if(result.length > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
	}

	public int[] deleteAccount(int[] accNos) {
		Connection con = getConnection();
		
		int[] result = new CommiAndAccountDao().deleteAccount(con,accNos);
		
		if(result.length > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
	}

}
