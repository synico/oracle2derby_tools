package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MSGSTORE;

public class MSGSTORERowMapper<T> implements RowMapper<MSGSTORE> {

	@Override
	public MSGSTORE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MSGSTORE obj = new MSGSTORE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMSGID(rs.getBigDecimal("MSGID"));
		obj.setMESSAGE(rs.getBlob("MESSAGE"));
		obj.setRETRIES(rs.getBigDecimal("RETRIES"));
		obj.setEXPIRY(rs.getTimestamp("EXPIRY"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setMESSAGEINDEX(rs.getBigDecimal("MESSAGEINDEX"));
		
		return obj;
	}

}
