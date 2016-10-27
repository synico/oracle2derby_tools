package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAGCLASS;

public class TAGCLASSRowMapper<T> implements RowMapper<TAGCLASS> {

    private static final Logger log = Logger.getLogger(TAGCLASSRowMapper.class);

	@Override
	public TAGCLASS mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAGCLASS obj = new TAGCLASS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setTAGNAME(rs.getString("TAGNAME"));
		obj.setTAGCLASSNAME(rs.getString("TAGCLASSNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
