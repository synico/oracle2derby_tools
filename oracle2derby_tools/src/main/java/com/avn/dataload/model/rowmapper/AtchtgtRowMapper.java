package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchtgt;

public class AtchtgtRowMapper<T> implements RowMapper<Atchtgt> {

	@Override
	public Atchtgt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchtgt obj = new Atchtgt();
		
		obj.setAttachusgId(rs.getString("ATTACHUSG_ID"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setAtchtgtId(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
