package com.pkb.commiAndAccount.model.dao;

import static com.pkb.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.pkb.commiAndAccount.model.vo.Account;
import com.pkb.commiAndAccount.model.vo.Commission;
import com.pkb.commiAndAccount.model.vo.CommissionAndAccountList;
public class CommiAndAccountDao {

	private Properties prop = new Properties();

	public CommiAndAccountDao() {
		String fileName = CommiAndAccountDao.class.getResource("/sql/commiAndAccount/commiAndAccount-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CommissionAndAccountList selectCommitonList(Connection con) {
		// TODO Auto-generated method stub
		Statement stmt = null;
		ResultSet rs = null;
		CommissionAndAccountList caa = null;
		String query = prop.getProperty("selectCommitonList");
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			caa = new CommissionAndAccountList();
			caa.setClist(new ArrayList<Commission>());
			while(rs.next()){
				Commission co = new Commission();
				co.setPetCategory(rs.getInt("PET_CATEGORY"));
				co.setFee_rate(rs.getInt("FEE_RATE"));
				co.setPetCategoryName(rs.getString("PET_CATEGORYNAME"));
				caa.getClist().add(co);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		return caa;
	}

	public CommissionAndAccountList selectAccountList(Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		String query = prop.getProperty("selectAccountList");
		CommissionAndAccountList caa = null;
		try {
			stmt = con.createStatement();
			rs= stmt.executeQuery(query);
			caa = new CommissionAndAccountList();
			caa.setAlist(new ArrayList<Account>());
			while(rs.next()){
				Account ac = new Account();
				ac.setWithdrawInfoNo(rs.getInt("WITHDRAW_INFO_NO"));
				ac.setAccountNo(rs.getString("ACCOUNT_NO"));
				ac.setBankName(rs.getString("BANK_NAME"));
				ac.setUser_name(rs.getString("USER_NAME"));
				
				caa.getAlist().add(ac);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return caa;
	}

}
