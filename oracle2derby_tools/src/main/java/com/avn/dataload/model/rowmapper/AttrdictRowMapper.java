package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrdict;

public class AttrdictRowMapper<T> implements RowMapper<Attrdict> {

	@Override
	public Attrdict mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrdict obj = new Attrdict();
		
		obj.setAttrdictId(rs.getBigDecimal("ATTRDICT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
