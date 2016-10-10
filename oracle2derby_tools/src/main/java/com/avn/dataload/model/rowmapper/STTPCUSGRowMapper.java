package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STTPCUSG;

public class STTPCUSGRowMapper<T> implements RowMapper<STTPCUSG> {

	@Override
	public STTPCUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STTPCUSG obj = new STTPCUSG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSTTPCUSG_ID(rs.getBigDecimal("STTPCUSG_ID"));
		
		return obj;
	}

}
