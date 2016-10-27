package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRSCGDES;

public class ACRSCGDESRowMapper<T> implements RowMapper<ACRSCGDES> {

    private static final Logger log = Logger.getLogger(ACRSCGDESRowMapper.class);

	@Override
	public ACRSCGDES mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRSCGDES obj = new ACRSCGDES();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
