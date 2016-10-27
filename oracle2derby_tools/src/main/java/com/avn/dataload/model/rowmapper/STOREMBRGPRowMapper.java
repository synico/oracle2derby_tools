package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREMBRGP;

public class STOREMBRGPRowMapper<T> implements RowMapper<STOREMBRGP> {

    private static final Logger log = Logger.getLogger(STOREMBRGPRowMapper.class);

	@Override
	public STOREMBRGP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREMBRGP obj = new STOREMBRGP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
