package com.payroll.outbound.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.payroll.outbound.test.model.Enrollment;

public class EnrollmentRowMapper implements RowMapper<Enrollment> {

	public Enrollment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Enrollment enrollment = new Enrollment();
		enrollment.setPersonid(rs.getInt("member_oid"));
		enrollment.setBenefit_name(rs.getString("benefit_name"));
		enrollment.setBenefit_cost(rs.getString("benefit_cost"));
		enrollment.setBenefit_status(rs.getString("benefit_status"));
		enrollment.setSponsoroid(rs.getInt("sponsor_oid"));
		return enrollment;
	}

}
