package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPLGPSUBS;

public class ACPLGPSUBSRowMapper<T> implements RowMapper<ACPLGPSUBS> {

    private static final Logger log = Logger.getLogger(ACPLGPSUBSRowMapper.class);

	@Override
	public ACPLGPSUBS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPLGPSUBS obj = new ACPLGPSUBS();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
