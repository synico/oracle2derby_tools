package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTGCMT;

public class CMFTGCMTRowMapper<T> implements RowMapper<CMFTGCMT> {

    private static final Logger log = Logger.getLogger(CMFTGCMTRowMapper.class);

	@Override
	public CMFTGCMT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTGCMT obj = new CMFTGCMT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setCMFTASKGRP_ID(rs.getBigDecimal("CMFTASKGRP_ID"));
		obj.setCMFTGCMT_ID(rs.getBigDecimal("CMFTGCMT_ID"));
		obj.setPOSTEDDATE(rs.getTimestamp("POSTEDDATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
