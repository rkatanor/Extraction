package com.payroll.outbound.test.model;

public class Benefits {
		private String benefit_name;
		private String benefit_rate;
		public String getBenefit_name() {
			return benefit_name;
		}
		public void setBenefit_name(String benefit_name) {
			this.benefit_name = benefit_name;
		}
		public String getBenefit_rate() {
			return benefit_rate;
		}
		public void setBenefit_rate(String benefit_rate) {
			this.benefit_rate = benefit_rate;
		}
		@Override
		public String toString() {
			return "Benefits [benefit_name=" + benefit_name + ", benefit_rate=" + benefit_rate + "]";
		}
		
		
}
