package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHCONF;

public class SRCHCONFRowMapper<T> implements RowMapper<SRCHCONF> {

    private static final Logger log = Logger.getLogger(SRCHCONFRowMapper.class);

	@Override
	public SRCHCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHCONF obj = new SRCHCONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINDEXSCOPE(rs.getString("INDEXSCOPE"));
		obj.setINDEXTYPE(rs.getString("INDEXTYPE"));
		obj.setLANGUAGES(rs.getString("LANGUAGES"));
		obj.setCONFIG(rs.getString("CONFIG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
