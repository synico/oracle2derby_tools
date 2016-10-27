package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CNTRSTORE;

public class CNTRSTORERowMapper<T> implements RowMapper<CNTRSTORE> {

    private static final Logger log = Logger.getLogger(CNTRSTORERowMapper.class);

	@Override
	public CNTRSTORE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CNTRSTORE obj = new CNTRSTORE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		obj.setSTOREXML(rs.getClob("STOREXML"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
