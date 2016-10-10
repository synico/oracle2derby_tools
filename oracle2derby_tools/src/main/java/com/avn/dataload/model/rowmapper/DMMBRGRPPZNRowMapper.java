package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMMBRGRPPZN;

public class DMMBRGRPPZNRowMapper<T> implements RowMapper<DMMBRGRPPZN> {

	@Override
	public DMMBRGRPPZN mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMMBRGRPPZN obj = new DMMBRGRPPZN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setPERSONALIZATIONID(rs.getString("PERSONALIZATIONID"));
		
		return obj;
	}

}
