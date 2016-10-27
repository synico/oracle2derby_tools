package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSOURCE;

public class XSOURCERowMapper<T> implements RowMapper<XSOURCE> {

    private static final Logger log = Logger.getLogger(XSOURCERowMapper.class);

	@Override
	public XSOURCE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSOURCE obj = new XSOURCE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSOURCE_NAME(rs.getString("SOURCE_NAME"));
		obj.setSOURCE_ID(rs.getBigDecimal("SOURCE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
