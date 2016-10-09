package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MsgstoreKey;

public class MsgstoreKeyRowMapper<T> implements RowMapper<MsgstoreKey> {

	@Override
	public MsgstoreKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MsgstoreKey obj = new MsgstoreKey();
		
		obj.setMessageindex(rs.getBigDecimal("MESSAGEINDEX"));
		obj.setMsgid(rs.getBigDecimal("MSGID"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		
		return obj;
	}

}
