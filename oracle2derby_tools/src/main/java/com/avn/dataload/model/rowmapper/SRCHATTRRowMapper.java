package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHATTR;

public class SRCHATTRRowMapper<T> implements RowMapper<SRCHATTR> {

    private static final Logger log = Logger.getLogger(SRCHATTRRowMapper.class);

	@Override
	public SRCHATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHATTR obj = new SRCHATTR();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		obj.setINDEXSCOPE(rs.getString("INDEXSCOPE"));
		obj.setINDEXTYPE(rs.getString("INDEXTYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
