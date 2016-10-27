package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORGCODE;

public class ORGCODERowMapper<T> implements RowMapper<ORGCODE> {

    private static final Logger log = Logger.getLogger(ORGCODERowMapper.class);

	@Override
	public ORGCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORGCODE obj = new ORGCODE();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setORGCODE_ID(rs.getBigDecimal("ORGCODE_ID"));
		obj.setCODETYPE(rs.getString("CODETYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
