package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Policy;

public class PolicyRowMapper<T> implements RowMapper<Policy> {

	@Override
	public Policy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Policy obj = new Policy();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPolicyname(rs.getString("POLICYNAME"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPolicytypeId(rs.getString("POLICYTYPE_ID"));
		obj.setStarttime(rs.getDate("STARTTIME"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
