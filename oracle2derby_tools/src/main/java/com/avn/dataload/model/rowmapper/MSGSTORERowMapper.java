package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MSGSTORE;

public class MSGSTORERowMapper<T> implements RowMapper<MSGSTORE> {

    private static final Logger log = Logger.getLogger(MSGSTORERowMapper.class);

	@Override
	public MSGSTORE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MSGSTORE obj = new MSGSTORE();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMESSAGEINDEX(rs.getBigDecimal("MESSAGEINDEX"));
		obj.setMSGID(rs.getBigDecimal("MSGID"));
		obj.setMESSAGE(rs.getBlob("MESSAGE"));
		obj.setRETRIES(rs.getBigDecimal("RETRIES"));
		obj.setEXPIRY(rs.getTimestamp("EXPIRY"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
