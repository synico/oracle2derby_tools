package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XINVLOG;

public class XINVLOGRowMapper<T> implements RowMapper<XINVLOG> {

    private static final Logger log = Logger.getLogger(XINVLOGRowMapper.class);

	@Override
	public XINVLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XINVLOG obj = new XINVLOG();
		
		obj.setLASTUPDATE(rs.getString("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSAPMATERIALID(rs.getString("SAPMATERIALID"));
		obj.setPROCESSED(rs.getString("PROCESSED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
