package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGPRES;

public class ACRESGPRESRowMapper<T> implements RowMapper<ACRESGPRES> {

    private static final Logger log = Logger.getLogger(ACRESGPRESRowMapper.class);

	@Override
	public ACRESGPRES mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGPRES obj = new ACRESGPRES();
		
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
