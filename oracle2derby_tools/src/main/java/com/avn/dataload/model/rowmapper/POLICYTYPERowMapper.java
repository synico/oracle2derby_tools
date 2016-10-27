package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYTYPE;

public class POLICYTYPERowMapper<T> implements RowMapper<POLICYTYPE> {

    private static final Logger log = Logger.getLogger(POLICYTYPERowMapper.class);

	@Override
	public POLICYTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYTYPE obj = new POLICYTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
