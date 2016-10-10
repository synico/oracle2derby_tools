package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATALOG;

public class CATALOGRowMapper<T> implements RowMapper<CATALOG> {

	@Override
	public CATALOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATALOG obj = new CATALOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setTPCLEVEL(rs.getBigDecimal("TPCLEVEL"));
		
		return obj;
	}

}
