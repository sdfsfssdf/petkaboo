package com.pkb.petsitterService.model.vo;

import java.sql.Date;

public class Petsitter {
	private int pet_service_regno;		// 펫시터 서비스 등록번호
	private int pet_regno;				// 펫시터 서비스 상세 번호
	private int user_no;				// 회원번호
	private String nick_name;			// 닉네임
	private String user_name;			// 실명
	private int user_grade;				// 회원등급
	private String gender;				// 성별
	private String address;				// 주소
	private String contract_type;		// 계약종류
	private int pet_category;			// 계약가능동물
	private Date contract_start;		// 계약가능시작일
	private Date contract_end;			// 계약가능종료일
	private String service_detail;		// 서비스 상세 내용
	private String service_restrict;	// 서비스 제한 사항
	
	public Petsitter(){}

	public Petsitter(int pet_service_regno, int pet_regno, int user_no, String nick_name, String user_name,
			int user_grade, String gender, String address, String contract_type, int pet_category, Date contract_start,
			Date contract_end, String service_detail, String service_restrict) {
		// super();
		this.pet_service_regno = pet_service_regno;
		this.pet_regno = pet_regno;
		this.user_no = user_no;
		this.nick_name = nick_name;
		this.user_name = user_name;
		this.user_grade = user_grade;
		this.gender = gender;
		this.address = address;
		this.contract_type = contract_type;
		this.pet_category = pet_category;
		this.contract_start = contract_start;
		this.contract_end = contract_end;
		this.service_detail = service_detail;
		this.service_restrict = service_restrict;
	}

	public int getPet_service_regno() {
		return pet_service_regno;
	}

	public int getPet_regno() {
		return pet_regno;
	}

	public int getUser_no() {
		return user_no;
	}

	public String getNick_name() {
		return nick_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public int getUser_grade() {
		return user_grade;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getContract_type() {
		return contract_type;
	}

	public int getPet_category() {
		return pet_category;
	}

	public Date getContract_start() {
		return contract_start;
	}

	public Date getContract_end() {
		return contract_end;
	}

	public String getService_detail() {
		return service_detail;
	}

	public String getService_restrict() {
		return service_restrict;
	}

	public void setPet_service_regno(int pet_service_regno) {
		this.pet_service_regno = pet_service_regno;
	}

	public void setPet_regno(int pet_regno) {
		this.pet_regno = pet_regno;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_grade(int user_grade) {
		this.user_grade = user_grade;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

	public void setPet_category(int pet_category) {
		this.pet_category = pet_category;
	}

	public void setContract_start(Date contract_start) {
		this.contract_start = contract_start;
	}

	public void setContract_end(Date contract_end) {
		this.contract_end = contract_end;
	}

	public void setService_detail(String service_detail) {
		this.service_detail = service_detail;
	}

	public void setService_restrict(String service_restrict) {
		this.service_restrict = service_restrict;
	}

	@Override
	public String toString() {
		return "Petsitter [pet_service_regno=" + pet_service_regno + ", pet_regno=" + pet_regno + ", user_no=" + user_no
				+ ", nick_name=" + nick_name + ", user_name=" + user_name + ", user_grade=" + user_grade + ", gender="
				+ gender + ", address=" + address + ", contract_type=" + contract_type + ", pet_category="
				+ pet_category + ", contract_start=" + contract_start + ", contract_end=" + contract_end
				+ ", service_detail=" + service_detail + ", service_restrict=" + service_restrict + "]";
	}
	
}
