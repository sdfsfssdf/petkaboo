package com.pkb.commiAndAccount.model.vo;

import java.util.ArrayList;

public class CommissionAndAccountList {
	private ArrayList<Account> alist;
	private ArrayList<Commission> clist;
	
	public CommissionAndAccountList() { }

	public CommissionAndAccountList(ArrayList<Account> alist, ArrayList<Commission> clist) {
		super();
		this.alist = alist;
		this.clist = clist;
	}

	public ArrayList<Account> getAlist() {
		return alist;
	}

	public ArrayList<Commission> getClist() {
		return clist;
	}

	public void setAlist(ArrayList<Account> alist) {
		this.alist = alist;
	}

	public void setClist(ArrayList<Commission> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "CommissionAndAccountList [alist=" + alist + ", clist=" + clist + "]";
	}
	
	
}
