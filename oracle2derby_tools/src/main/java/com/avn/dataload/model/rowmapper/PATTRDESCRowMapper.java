package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PATTRDESC;

public class PATTRDESCRowMapper<T> implements RowMapper<PATTRDESC> {

    private static final Logger log = Logger.getLogger(PATTRDESCRowMapper.class);

	@Override
	public PATTRDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PATTRDESC obj = new PATTRDESC();
		
		obj.setPATTRIBUTE_ID(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
