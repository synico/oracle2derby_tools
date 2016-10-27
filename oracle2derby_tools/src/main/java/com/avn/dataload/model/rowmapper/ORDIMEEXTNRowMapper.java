package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDIMEEXTN;

public class ORDIMEEXTNRowMapper<T> implements RowMapper<ORDIMEEXTN> {

    private static final Logger log = Logger.getLogger(ORDIMEEXTNRowMapper.class);

	@Override
	public ORDIMEEXTN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDIMEEXTN obj = new ORDIMEEXTN();
		
		obj.setREQUESTEDSHIPTIME(rs.getTimestamp("REQUESTEDSHIPTIME"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setCOMMENTS1(rs.getString("COMMENTS1"));
		obj.setCOMMENTS2(rs.getString("COMMENTS2"));
		obj.setSHIPASCOMPLETE(rs.getString("SHIPASCOMPLETE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
