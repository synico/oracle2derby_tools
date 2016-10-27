package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ROLEDESC;

public class ROLEDESCRowMapper<T> implements RowMapper<ROLEDESC> {

    private static final Logger log = Logger.getLogger(ROLEDESCRowMapper.class);

	@Override
	public ROLEDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ROLEDESC obj = new ROLEDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
