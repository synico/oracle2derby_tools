package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PolicydescKey;

public class PolicydescKeyRowMapper<T> implements RowMapper<PolicydescKey> {

	@Override
	public PolicydescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicydescKey obj = new PolicydescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
