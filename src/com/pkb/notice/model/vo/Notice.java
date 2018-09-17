package com.pkb.notice.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Notice implements Serializable {
	private int article_no_1;			//게시물 번호
	private String user_name;			//작성자 이름
	private Date article_date;			//작성일시
	private String article_title;		//글제목
	private String article_contents;	//글내용
	private String article_type;		//게시물타입
	private int article_lv;				//게시물레벨
	private int refno;					//참고게시물번호	
	
	public Notice() {
		
	}

	public Notice(int article_no_1, String user_name, Date article_date, String article_title, String article_contents,
			String article_type, int article_lv, int refno) {
		super();
		this.article_no_1 = article_no_1;
		this.user_name = user_name;
		this.article_date = article_date;
		this.article_title = article_title;
		this.article_contents = article_contents;
		this.article_type = article_type;
		this.article_lv = article_lv;
		this.refno = refno;
	}

	public int getArticle_no_1() {
		return article_no_1;
	}


	public Date getArticle_date() {
		return article_date;
	}

	public String getArticle_title() {
		return article_title;
	}

	public String getArticle_contents() {
		return article_contents;
	}

	public String getArticle_type() {
		return article_type;
	}

	public int getArticle_lv() {
		return article_lv;
	}

	public int getRefno() {
		return refno;
	}

	public void setArticle_no_1(int article_no_1) {
		this.article_no_1 = article_no_1;
	}



	public void setArticle_date(Date article_date) {
		this.article_date = article_date;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public void setArticle_contents(String article_contents) {
		this.article_contents = article_contents;
	}

	public void setArticle_type(String article_type) {
		this.article_type = article_type;
	}

	public void setArticle_lv(int article_lv) {
		this.article_lv = article_lv;
	}

	public void setRefno(int refno) {
		this.refno = refno;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Notice [article_no_1=" + article_no_1 + ", user_name=" + user_name + ", article_date=" + article_date
				+ ", article_title=" + article_title + ", article_contents=" + article_contents + ", article_type="
				+ article_type + ", article_lv=" + article_lv + ", refno=" + refno + "]";
	}


	
}
