package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SITE;

public class SITERowMapper<T> implements RowMapper<SITE> {

    private static final Logger log = Logger.getLogger(SITERowMapper.class);

	@Override
	public SITE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SITE obj = new SITE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setEDITION(rs.getString("EDITION"));
		obj.setRELEASE(rs.getBigDecimal("RELEASE"));
		obj.setMOD(rs.getBigDecimal("MOD"));
		obj.setFIXPACK(rs.getBigDecimal("FIXPACK"));
		obj.setCOMPNAME(rs.getString("COMPNAME"));
		obj.setDATABASEVENDOR(rs.getString("DATABASEVENDOR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
