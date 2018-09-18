package com.pkb.commiAndAccount.model.service;

import static com.pkb.common.JDBCTemplate.close;
import static com.pkb.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.pkb.commiAndAccount.model.dao.CommiAndAccountDao;
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

}
