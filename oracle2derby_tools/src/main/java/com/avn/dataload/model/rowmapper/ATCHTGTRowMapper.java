package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHTGT;

public class ATCHTGTRowMapper<T> implements RowMapper<ATCHTGT> {

    private static final Logger log = Logger.getLogger(ATCHTGTRowMapper.class);

	@Override
	public ATCHTGT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHTGT obj = new ATCHTGT();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setATCHTGT_ID(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setATTACHUSG_ID(rs.getString("ATTACHUSG_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
