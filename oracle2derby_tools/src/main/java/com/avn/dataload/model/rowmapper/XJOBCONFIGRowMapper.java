package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XJOBCONFIG;

public class XJOBCONFIGRowMapper<T> implements RowMapper<XJOBCONFIG> {

	@Override
	public XJOBCONFIG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XJOBCONFIG obj = new XJOBCONFIG();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setCONFIGNAME(rs.getString("CONFIGNAME"));
		obj.setJOBIDENTIFIER(rs.getString("JOBIDENTIFIER"));
		obj.setDATEVALUE(rs.getTimestamp("DATEVALUE"));
		
		return obj;
	}

}
