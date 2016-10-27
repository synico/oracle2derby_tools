package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFWSTGREL;

public class CMFWSTGRELRowMapper<T> implements RowMapper<CMFWSTGREL> {

    private static final Logger log = Logger.getLogger(CMFWSTGRELRowMapper.class);

	@Override
	public CMFWSTGREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFWSTGREL obj = new CMFWSTGREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCMFTASKGRP_ID(rs.getBigDecimal("CMFTASKGRP_ID"));
		obj.setCMFWKSPC_ID(rs.getBigDecimal("CMFWKSPC_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
