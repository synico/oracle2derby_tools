package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAGDPLYREL;

public class TAGDPLYRELRowMapper<T> implements RowMapper<TAGDPLYREL> {

    private static final Logger log = Logger.getLogger(TAGDPLYRELRowMapper.class);

	@Override
	public TAGDPLYREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAGDPLYREL obj = new TAGDPLYREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setTAGNAME(rs.getString("TAGNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
