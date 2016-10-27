package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATOVRGRP;

public class CATOVRGRPRowMapper<T> implements RowMapper<CATOVRGRP> {

    private static final Logger log = Logger.getLogger(CATOVRGRPRowMapper.class);

	@Override
	public CATOVRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATOVRGRP obj = new CATOVRGRP();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCATOVRGRP_ID(rs.getBigDecimal("CATOVRGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
