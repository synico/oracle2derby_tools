package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPLGPDESC;

public class ACPLGPDESCRowMapper<T> implements RowMapper<ACPLGPDESC> {

	@Override
	public ACPLGPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPLGPDESC obj = new ACPLGPDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		
		return obj;
	}

}
