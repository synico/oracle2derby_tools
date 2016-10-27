package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STTPCUSG;

public class STTPCUSGRowMapper<T> implements RowMapper<STTPCUSG> {

    private static final Logger log = Logger.getLogger(STTPCUSGRowMapper.class);

	@Override
	public STTPCUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STTPCUSG obj = new STTPCUSG();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSTTPCUSG_ID(rs.getBigDecimal("STTPCUSG_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
