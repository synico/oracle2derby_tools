package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREMBRGP;

public class STOREMBRGPRowMapper<T> implements RowMapper<STOREMBRGP> {

	@Override
	public STOREMBRGP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREMBRGP obj = new STOREMBRGP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
