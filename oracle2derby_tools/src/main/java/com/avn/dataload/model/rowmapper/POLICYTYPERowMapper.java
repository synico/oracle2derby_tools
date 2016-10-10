package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYTYPE;

public class POLICYTYPERowMapper<T> implements RowMapper<POLICYTYPE> {

	@Override
	public POLICYTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYTYPE obj = new POLICYTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		
		return obj;
	}

}
