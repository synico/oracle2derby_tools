package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XMSG;

public class XMSGRowMapper<T> implements RowMapper<XMSG> {

    private static final Logger log = Logger.getLogger(XMSGRowMapper.class);

	@Override
	public XMSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XMSG obj = new XMSG();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getBlob("FIELD4"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setENTITY_TYPE(rs.getString("ENTITY_TYPE"));
		obj.setLAST_UPDATE(rs.getTimestamp("LAST_UPDATE"));
		obj.setXMSG_ID(rs.getBigDecimal("XMSG_ID"));
		obj.setREQUEST(rs.getBlob("REQUEST"));
		obj.setRESPONSE(rs.getBlob("RESPONSE"));
		obj.setENTITY_ID(rs.getBigDecimal("ENTITY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
