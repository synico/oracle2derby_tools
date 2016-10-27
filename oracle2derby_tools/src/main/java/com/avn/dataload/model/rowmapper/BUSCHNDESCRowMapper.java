package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSCHNDESC;

public class BUSCHNDESCRowMapper<T> implements RowMapper<BUSCHNDESC> {

    private static final Logger log = Logger.getLogger(BUSCHNDESCRowMapper.class);

	@Override
	public BUSCHNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSCHNDESC obj = new BUSCHNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
