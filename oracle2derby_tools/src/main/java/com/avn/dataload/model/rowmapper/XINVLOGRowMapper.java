package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XINVLOG;

public class XINVLOGRowMapper<T> implements RowMapper<XINVLOG> {

	@Override
	public XINVLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XINVLOG obj = new XINVLOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLASTUPDATE(rs.getString("LASTUPDATE"));
		obj.setPROCESSED(rs.getString("PROCESSED"));
		obj.setSAPMATERIALID(rs.getString("SAPMATERIALID"));
		
		return obj;
	}

}
