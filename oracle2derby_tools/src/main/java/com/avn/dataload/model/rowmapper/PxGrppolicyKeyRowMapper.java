package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxGrppolicyKey;

public class PxGrppolicyKeyRowMapper<T> implements RowMapper<PxGrppolicyKey> {

	@Override
	public PxGrppolicyKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxGrppolicyKey obj = new PxGrppolicyKey();
		
		obj.setPxGroupId(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setPxPolicyId(rs.getBigDecimal("PX_POLICY_ID"));
		
		return obj;
	}

}
