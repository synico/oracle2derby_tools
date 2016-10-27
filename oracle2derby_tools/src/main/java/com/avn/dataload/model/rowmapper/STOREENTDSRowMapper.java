package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREENTDS;

public class STOREENTDSRowMapper<T> implements RowMapper<STOREENTDS> {

    private static final Logger log = Logger.getLogger(STOREENTDSRowMapper.class);

	@Override
	public STOREENTDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREENTDS obj = new STOREENTDS();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSTADDRESS_ID_LOC(rs.getBigDecimal("STADDRESS_ID_LOC"));
		obj.setSTADDRESS_ID_CONT(rs.getBigDecimal("STADDRESS_ID_CONT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
