package com.payroll.outbound.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SnapshotRowMapper implements RowMapper<Snapshot>{

	public Snapshot mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
					Snapshot snap=new Snapshot();
					snap.setMember_OID(rs.getInt("MEMBER_OID"));
					snap.setSnapshot(rs.getString("SNAPSHOT,"));
					snap.setSnapshot_type(rs.getString("SNAPSHOT_TYPE"));
					return snap;
					
	}

}
