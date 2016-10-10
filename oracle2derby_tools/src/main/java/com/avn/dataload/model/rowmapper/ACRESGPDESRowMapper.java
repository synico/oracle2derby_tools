package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGPDES;

public class ACRESGPDESRowMapper<T> implements RowMapper<ACRESGPDES> {

	@Override
	public ACRESGPDES mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGPDES obj = new ACRESGPDES();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		
		return obj;
	}

}
