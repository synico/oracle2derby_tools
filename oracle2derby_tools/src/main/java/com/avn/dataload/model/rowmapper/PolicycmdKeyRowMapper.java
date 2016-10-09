package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PolicycmdKey;

public class PolicycmdKeyRowMapper<T> implements RowMapper<PolicycmdKey> {

	@Override
	public PolicycmdKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicycmdKey obj = new PolicycmdKey();
		
		obj.setBusinesscmdclass(rs.getString("BUSINESSCMDCLASS"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
