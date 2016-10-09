package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPolicy;

public class PxPolicyRowMapper<T> implements RowMapper<PxPolicy> {

	@Override
	public PxPolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPolicy obj = new PxPolicy();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setXmlparam(rs.getString("XMLPARAM"));
		obj.setPxPolicyId(rs.getBigDecimal("PX_POLICY_ID"));
		obj.setImplcls(rs.getString("IMPLCLS"));
		
		return obj;
	}

}
