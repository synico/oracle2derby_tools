package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TCSUBTYPDS;

public class TCSUBTYPDSRowMapper<T> implements RowMapper<TCSUBTYPDS> {

    private static final Logger log = Logger.getLogger(TCSUBTYPDSRowMapper.class);

	@Override
	public TCSUBTYPDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		TCSUBTYPDS obj = new TCSUBTYPDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTCSUBTYPE_ID(rs.getString("TCSUBTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
