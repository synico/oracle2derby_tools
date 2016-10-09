package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storeent;

public class StoreentRowMapper<T> implements RowMapper<Storeent> {

	@Override
	public Storeent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storeent obj = new Storeent();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setType(rs.getString("TYPE"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
