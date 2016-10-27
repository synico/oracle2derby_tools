package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPMBR;

public class MBRGRPMBRRowMapper<T> implements RowMapper<MBRGRPMBR> {

    private static final Logger log = Logger.getLogger(MBRGRPMBRRowMapper.class);

	@Override
	public MBRGRPMBR mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPMBR obj = new MBRGRPMBR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setCUSTOMERID(rs.getString("CUSTOMERID"));
		obj.setEXCLUDE(rs.getString("EXCLUDE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
