package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICMREGDESC;

public class ICMREGDESCRowMapper<T> implements RowMapper<ICMREGDESC> {

    private static final Logger log = Logger.getLogger(ICMREGDESCRowMapper.class);

	@Override
	public ICMREGDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICMREGDESC obj = new ICMREGDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMETAPHORTYPEID(rs.getBigDecimal("METAPHORTYPEID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTITLE(rs.getString("TITLE"));
		obj.setICONNAME(rs.getString("ICONNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
