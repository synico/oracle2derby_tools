package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PolicytcKey;

public class PolicytcKeyRowMapper<T> implements RowMapper<PolicytcKey> {

	@Override
	public PolicytcKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicytcKey obj = new PolicytcKey();
		
		obj.setTermcondId(rs.getBigDecimal("TERMCOND_ID"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
