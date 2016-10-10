package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.JURST;

public class JURSTRowMapper<T> implements RowMapper<JURST> {

	@Override
	public JURST mapRow(ResultSet rs, int rowNum) throws SQLException {
		JURST obj = new JURST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setCITY(rs.getString("CITY"));
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		obj.setCOUNTRYABBR(rs.getString("COUNTRYABBR"));
		obj.setJURST_ID(rs.getBigDecimal("JURST_ID"));
		obj.setSTATEABBR(rs.getString("STATEABBR"));
		obj.setDISTRICT(rs.getString("DISTRICT"));
		obj.setCOUNTY(rs.getString("COUNTY"));
		obj.setZIPCODEEND(rs.getString("ZIPCODEEND"));
		obj.setGEOCODE(rs.getString("GEOCODE"));
		obj.setZIPCODESTART(rs.getString("ZIPCODESTART"));
		
		return obj;
	}

}
