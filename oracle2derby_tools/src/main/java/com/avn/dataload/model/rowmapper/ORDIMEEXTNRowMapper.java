package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDIMEEXTN;

public class ORDIMEEXTNRowMapper<T> implements RowMapper<ORDIMEEXTN> {

	@Override
	public ORDIMEEXTN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDIMEEXTN obj = new ORDIMEEXTN();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setCOMMENTS1(rs.getString("COMMENTS1"));
		obj.setCOMMENTS2(rs.getString("COMMENTS2"));
		obj.setSHIPASCOMPLETE(rs.getString("SHIPASCOMPLETE"));
		obj.setREQUESTEDSHIPTIME(rs.getTimestamp("REQUESTEDSHIPTIME"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		
		return obj;
	}

}
