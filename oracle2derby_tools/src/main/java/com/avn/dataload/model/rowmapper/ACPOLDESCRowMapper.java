package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLDESC;

public class ACPOLDESCRowMapper<T> implements RowMapper<ACPOLDESC> {

    private static final Logger log = Logger.getLogger(ACPOLDESCRowMapper.class);

	@Override
	public ACPOLDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLDESC obj = new ACPOLDESC();
		
		obj.setACPOLICY_ID(rs.getBigDecimal("ACPOLICY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
