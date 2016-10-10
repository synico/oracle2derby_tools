package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGPRES;

public class ACRESGPRESRowMapper<T> implements RowMapper<ACRESGPRES> {

	@Override
	public ACRESGPRES mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGPRES obj = new ACRESGPRES();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		
		return obj;
	}

}
