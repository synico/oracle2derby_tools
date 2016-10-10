package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACACGPDESC;

public class ACACGPDESCRowMapper<T> implements RowMapper<ACACGPDESC> {

	@Override
	public ACACGPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACACGPDESC obj = new ACACGPDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACACTGRP_ID(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
