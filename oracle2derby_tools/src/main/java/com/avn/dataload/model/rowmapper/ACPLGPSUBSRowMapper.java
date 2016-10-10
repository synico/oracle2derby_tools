package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPLGPSUBS;

public class ACPLGPSUBSRowMapper<T> implements RowMapper<ACPLGPSUBS> {

	@Override
	public ACPLGPSUBS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPLGPSUBS obj = new ACPLGPSUBS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		
		return obj;
	}

}
