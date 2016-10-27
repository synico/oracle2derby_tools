package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHTERM;

public class SRCHTERMRowMapper<T> implements RowMapper<SRCHTERM> {

    private static final Logger log = Logger.getLogger(SRCHTERMRowMapper.class);

	@Override
	public SRCHTERM mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHTERM obj = new SRCHTERM();
		
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTERM(rs.getString("TERM"));
		obj.setSRCHTERMASSOC_ID(rs.getBigDecimal("SRCHTERMASSOC_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
