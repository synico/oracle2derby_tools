package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XJOBCONFIG;

public class XJOBCONFIGRowMapper<T> implements RowMapper<XJOBCONFIG> {

    private static final Logger log = Logger.getLogger(XJOBCONFIGRowMapper.class);

	@Override
	public XJOBCONFIG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XJOBCONFIG obj = new XJOBCONFIG();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setJOBIDENTIFIER(rs.getString("JOBIDENTIFIER"));
		obj.setCONFIGNAME(rs.getString("CONFIGNAME"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setDATEVALUE(rs.getTimestamp("DATEVALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
