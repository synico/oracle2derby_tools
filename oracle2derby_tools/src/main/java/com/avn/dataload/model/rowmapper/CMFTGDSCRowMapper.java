package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTGDSC;

public class CMFTGDSCRowMapper<T> implements RowMapper<CMFTGDSC> {

    private static final Logger log = Logger.getLogger(CMFTGDSCRowMapper.class);

	@Override
	public CMFTGDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTGDSC obj = new CMFTGDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCMFTASKGRP_ID(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
