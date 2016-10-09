package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Msgstore;

public class MsgstoreRowMapper<T> implements RowMapper<Msgstore> {

	@Override
	public Msgstore mapRow(ResultSet rs, int rowNum) throws SQLException {
		Msgstore obj = new Msgstore();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setRetries(rs.getBigDecimal("RETRIES"));
		obj.setExpiry(rs.getDate("EXPIRY"));
		obj.setMessage(rs.getbyte[]("MESSAGE"));
		
		return obj;
	}

}
