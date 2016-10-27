package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATALOG;

public class CATALOGRowMapper<T> implements RowMapper<CATALOG> {

    private static final Logger log = Logger.getLogger(CATALOGRowMapper.class);

	@Override
	public CATALOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATALOG obj = new CATALOG();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setTPCLEVEL(rs.getBigDecimal("TPCLEVEL"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
