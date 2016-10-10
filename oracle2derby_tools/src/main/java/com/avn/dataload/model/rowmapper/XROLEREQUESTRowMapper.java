package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XROLEREQUEST;

public class XROLEREQUESTRowMapper<T> implements RowMapper<XROLEREQUEST> {

	@Override
	public XROLEREQUEST mapRow(ResultSet rs, int rowNum) throws SQLException {
		XROLEREQUEST obj = new XROLEREQUEST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		obj.setORGANIZATION_ID(rs.getBigDecimal("ORGANIZATION_ID"));
		obj.setAPPROVER_ID(rs.getBigDecimal("APPROVER_ID"));
		
		return obj;
	}

}
