package com.pkb.petsitterService.model.vo;

public class PetsitterServiceDataDetail {
	private int pet_regno;
	private int pet_category;
	private int pet_service_regno;
	private int service_charge;
	private int pet_count;
	private String service_detail;
	private String service_restrict;
	
	public PetsitterServiceDataDetail(){}

	public PetsitterServiceDataDetail(int pet_regno, int pet_category, int pet_service_regno, int service_charge,
			int pet_count, String service_detail, String service_restrict) {
		super();
		this.pet_regno = pet_regno;
		this.pet_category = pet_category;
		this.pet_service_regno = pet_service_regno;
		this.service_charge = service_charge;
		this.pet_count = pet_count;
		this.service_detail = service_detail;
		this.service_restrict = service_restrict;
	}

	public int getPet_regno() {
		return pet_regno;
	}

	public int getPet_category() {
		return pet_category;
	}

	public int getPet_service_regno() {
		return pet_service_regno;
	}

	public int getService_charge() {
		return service_charge;
	}

	public int getPet_count() {
		return pet_count;
	}

	public String getService_detail() {
		return service_detail;
	}

	public String getService_restrict() {
		return service_restrict;
	}

	public void setPet_regno(int pet_regno) {
		this.pet_regno = pet_regno;
	}

	public void setPet_category(int pet_category) {
		this.pet_category = pet_category;
	}

	public void setPet_service_regno(int pet_service_regno) {
		this.pet_service_regno = pet_service_regno;
	}

	public void setService_charge(int service_charge) {
		this.service_charge = service_charge;
	}

	public void setPet_count(int pet_count) {
		this.pet_count = pet_count;
	}

	public void setService_detail(String service_detail) {
		this.service_detail = service_detail;
	}

	public void setService_restrict(String service_restrict) {
		this.service_restrict = service_restrict;
	}

	@Override
	public String toString() {
		return "PetsitterServiceDataDetail [pet_regno=" + pet_regno + ", pet_category=" + pet_category
				+ ", pet_service_regno=" + pet_service_regno + ", service_charge=" + service_charge + ", pet_count="
				+ pet_count + ", service_detail=" + service_detail + ", service_restrict=" + service_restrict + "]";
	}
	
	

}
