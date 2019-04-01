package com.payroll.outbound.test.groups;

import com.payroll.outbound.test.model.Enrollment;

public class TestGroup {
	public static Enrollment rules(Enrollment enrollment) {
		if (enrollment.getBenefit_status().equals("A")) {
			if (enrollment.getSponsoroid() == 100100123) {
				if (enrollment.getPersonid() == 12661247) {
					return enrollment;
				}
			}

		}
		return null;

	}
}
