package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LANGUAGE;

public class LANGUAGERowMapper<T> implements RowMapper<LANGUAGE> {

    private static final Logger log = Logger.getLogger(LANGUAGERowMapper.class);

	@Override
	public LANGUAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		LANGUAGE obj = new LANGUAGE();
		
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMIMECHARSET(rs.getString("MIMECHARSET"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLOCALENAME(rs.getString("LOCALENAME"));
		obj.setLANGUAGE(rs.getString("LANGUAGE"));
		obj.setVARIANT(rs.getString("VARIANT"));
		obj.setENCODING(rs.getString("ENCODING"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
