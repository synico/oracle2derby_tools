package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.NOTIFY;

public class NOTIFYRowMapper<T> implements RowMapper<NOTIFY> {

	@Override
	public NOTIFY mapRow(ResultSet rs, int rowNum) throws SQLException {
		NOTIFY obj = new NOTIFY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMSGTYPE_ID(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setNOTIFY_ID(rs.getBigDecimal("NOTIFY_ID"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setNOTIFICATIONID(rs.getBigDecimal("NOTIFICATIONID"));
		obj.setTRANSPORTATTNAME(rs.getString("TRANSPORTATTNAME"));
		obj.setTRANSPORTATTVALUE(rs.getString("TRANSPORTATTVALUE"));
		
		return obj;
	}

}
