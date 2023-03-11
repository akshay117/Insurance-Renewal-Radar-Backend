package com.wecare.customermanagementservice.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_insurance")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sl_no;

	@Column(name = "customer_name")
	private String customer_name;

	@Column(name = "customer_phone_number")
	private String customer_phone_number;

	@Column(name = "customer_vehicle_number")
	private String customer_vehicle_number;

	@Column(name = "insurance_provider_company")
	private String insurance_provider_company;

	@Column(name = "premium_amount")
	private Double premium_amount;

	@Column(name = "path")
	private String path;

	@Column(name = "remarks")
	private String remarks;

	public Long getSl_no() {
		return sl_no;
	}

	public void setSl_no(Long sl_no) {
		this.sl_no = sl_no;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_phone_number() {
		return customer_phone_number;
	}

	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	public String getCustomer_vehicle_number() {
		return customer_vehicle_number;
	}

	public void setCustomer_vehicle_number(String customer_vehicle_number) {
		this.customer_vehicle_number = customer_vehicle_number;
	}

	public String getInsurance_provider_company() {
		return insurance_provider_company;
	}

	public void setInsurance_provider_company(String insurance_provider_company) {
		this.insurance_provider_company = insurance_provider_company;
	}

	public Double getPremium_amount() {
		return premium_amount;
	}

	public void setPremium_amount(Double premium_amount) {
		this.premium_amount = premium_amount;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Customer [sl_no=" + sl_no + ", customer_name=" + customer_name + ", customer_phone_number="
				+ customer_phone_number + ", customer_vehicle_number=" + customer_vehicle_number
				+ ", insurance_provider_company=" + insurance_provider_company + ", premium_amount=" + premium_amount
				+ ", path=" + path + ", remarks=" + remarks + "]";
	}

	
	
}
