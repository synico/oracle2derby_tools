package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREENT;

public class STOREENTRowMapper<T> implements RowMapper<STOREENT> {

    private static final Logger log = Logger.getLogger(STOREENTRowMapper.class);

	@Override
	public STOREENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREENT obj = new STOREENT();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
