package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPCOND;

public class MBRGRPCONDRowMapper<T> implements RowMapper<MBRGRPCOND> {

    private static final Logger log = Logger.getLogger(MBRGRPCONDRowMapper.class);

	@Override
	public MBRGRPCOND mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPCOND obj = new MBRGRPCOND();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setCONDITIONS(rs.getClob("CONDITIONS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
