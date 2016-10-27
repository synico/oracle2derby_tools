package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROFNVSTRG;

public class PROFNVSTRGRowMapper<T> implements RowMapper<PROFNVSTRG> {

    private static final Logger log = Logger.getLogger(PROFNVSTRGRowMapper.class);

	@Override
	public PROFNVSTRG mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROFNVSTRG obj = new PROFNVSTRG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROFNVSTRG_ID(rs.getBigDecimal("PROFNVSTRG_ID"));
		obj.setPROFILEATTNAME(rs.getString("PROFILEATTNAME"));
		obj.setPROFILEATTVALUE(rs.getString("PROFILEATTVALUE"));
		obj.setPROFILE_ID(rs.getBigDecimal("PROFILE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
