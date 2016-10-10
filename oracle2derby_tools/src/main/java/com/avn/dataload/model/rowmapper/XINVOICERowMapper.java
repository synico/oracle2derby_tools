package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XINVOICE;

public class XINVOICERowMapper<T> implements RowMapper<XINVOICE> {

	@Override
	public XINVOICE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XINVOICE obj = new XINVOICE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setFIELD4(rs.getTimestamp("FIELD4"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setEMAIL_FLAG(rs.getString("EMAIL_FLAG"));
		obj.setXINVOICE_ID(rs.getBigDecimal("XINVOICE_ID"));
		obj.setXINVOICE_DATE(rs.getTimestamp("XINVOICE_DATE"));
		obj.setXINVOICE_AMT(rs.getBigDecimal("XINVOICE_AMT"));
		obj.setEMAIL_SENT_TIME(rs.getTimestamp("EMAIL_SENT_TIME"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setFIELD6(rs.getString("FIELD6"));
		
		return obj;
	}

}
