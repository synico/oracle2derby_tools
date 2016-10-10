package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREENT;

public class STOREENTRowMapper<T> implements RowMapper<STOREENT> {

	@Override
	public STOREENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREENT obj = new STOREENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		
		return obj;
	}

}
