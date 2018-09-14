package com.pkb.member.model.vo;

import java.util.Date;

public class User {
	private int user_no;
	private String email;
	private String user_pwd;
	private int user_type;
	private String user_name;
	private String phone;
	private Date birthday;
	private String gender;
	private String address;
	private String sms_chk;
	private String email_chk;
	private Date enrollDate;
	private String nickname;
	private int user_grade;
	private String pet_auth;
	private int user_status;
	private String email_hash;
	
	
	public User(){}
	
	public User(String email, String user_pwd, String email_hash) {
		this.email = email;
		this.user_pwd = user_pwd;
		this.email_hash = email_hash;
	}


	public User(int user_no, String email, String user_pwd, int user_type, String user_name, String phone,
			Date birthday, String gender, String address, String sms_chk, String email_chk, Date enrollDate,
			String nickname, int user_grade, String pet_auth, int user_status, String email_hash) {
		this.user_no = user_no;
		this.email = email;
		this.user_pwd = user_pwd;
		this.user_type = user_type;
		this.user_name = user_name;
		this.phone = phone;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
		this.sms_chk = sms_chk;
		this.email_chk = email_chk;
		this.enrollDate = enrollDate;
		this.nickname = nickname;
		this.user_grade = user_grade;
		this.pet_auth = pet_auth;
		this.user_status = user_status;
		this.email_hash = email_hash;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public int getUser_type() {
		return user_type;
	}

	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSms_chk() {
		return sms_chk;
	}

	public void setSms_chk(String sms_chk) {
		this.sms_chk = sms_chk;
	}

	public String getEmail_chk() {
		return email_chk;
	}

	public void setEmail_chk(String email_chk) {
		this.email_chk = email_chk;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getUser_grade() {
		return user_grade;
	}

	public void setUser_grade(int user_grade) {
		this.user_grade = user_grade;
	}

	public String getPet_auth() {
		return pet_auth;
	}

	public void setPet_auth(String pet_auth) {
		this.pet_auth = pet_auth;
	}

	public int getUser_status() {
		return user_status;
	}

	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}

	public String getEmail_hash() {
		return email_hash;
	}

	public void setEmail_hash(String email_hash) {
		this.email_hash = email_hash;
	}

	@Override
	public String toString() {
		return "User [user_no=" + user_no + ", email=" + email + ", user_pwd=" + user_pwd + ", user_type=" + user_type
				+ ", user_name=" + user_name + ", phone=" + phone + ", birthday=" + birthday + ", gender=" + gender
				+ ", address=" + address + ", sms_chk=" + sms_chk + ", email_chk=" + email_chk + ", enrollDate="
				+ enrollDate + ", nickname=" + nickname + ", user_grade=" + user_grade + ", pet_auth=" + pet_auth
				+ ", user_status=" + user_status + ", email_hash=" + email_hash + "]";
	}


	
}
