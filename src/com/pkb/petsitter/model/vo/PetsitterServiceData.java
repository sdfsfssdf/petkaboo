package com.pkb.petsitter.model.vo;

import java.sql.Date;

public class PetsitterServiceData {
	private int pet_service_regno;
	private int user_no;
	private String contract_type;
	private String contract_days;
	private Date contract_start;
	private Date contract_end;
	
	public PetsitterServiceData(){}

	public PetsitterServiceData(int pet_service_regno, int user_no, String contract_type, String contract_days,
			Date contract_start, Date contract_end) {
		super();
		this.pet_service_regno = pet_service_regno;
		this.user_no = user_no;
		this.contract_type = contract_type;
		this.contract_days = contract_days;
		this.contract_start = contract_start;
		this.contract_end = contract_end;
	}

	public int getPet_service_regno() {
		return pet_service_regno;
	}

	public int getUser_no() {
		return user_no;
	}

	public String getContract_type() {
		return contract_type;
	}

	public String getContract_days() {
		return contract_days;
	}

	public Date getContract_start() {
		return contract_start;
	}

	public Date getContract_end() {
		return contract_end;
	}

	public void setPet_service_regno(int pet_service_regno) {
		this.pet_service_regno = pet_service_regno;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

	public void setContract_days(String contract_days) {
		this.contract_days = contract_days;
	}

	public void setContract_start(Date contract_start) {
		this.contract_start = contract_start;
	}

	public void setContract_end(Date contract_end) {
		this.contract_end = contract_end;
	}

	@Override
	public String toString() {
		return "PetsitterServiceData [pet_service_regno=" + pet_service_regno + ", user_no=" + user_no
				+ ", contract_type=" + contract_type + ", contract_days=" + contract_days + ", contract_start="
				+ contract_start + ", contract_end=" + contract_end + "]";
	};
	
	
}
