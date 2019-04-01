package com.payroll.outbound.test.model;

public class Enrollment {
	private int personid;
	private String benefit_name;
	private String benefit_cost;
	private String benefit_status;
	private int sponsoroid;

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getBenefit_name() {
		return benefit_name;
	}

	public void setBenefit_name(String benefit_name) {
		this.benefit_name = benefit_name;
	}

	public String getBenefit_cost() {
		return benefit_cost;
	}

	public void setBenefit_cost(String benefit_cost) {
		this.benefit_cost = benefit_cost;
	}

	public String getBenefit_status() {
		return benefit_status;
	}

	public void setBenefit_status(String benefit_status) {
		this.benefit_status = benefit_status;
	}

	public int getSponsoroid() {
		return sponsoroid;
	}

	public void setSponsoroid(int sponsoroid) {
		this.sponsoroid = sponsoroid;
	}

	@Override
	public String toString() {
		return "Enrollment [personid=" + personid + ", benefit_name=" + benefit_name + ", benefit_cost=" + benefit_cost
				+ ", benefit_status=" + benefit_status + ", sponsoroid=" + sponsoroid + "]";
	}

}
