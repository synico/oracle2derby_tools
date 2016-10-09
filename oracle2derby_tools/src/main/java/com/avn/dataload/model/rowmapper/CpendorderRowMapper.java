package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cpendorder;

public class CpendorderRowMapper<T> implements RowMapper<Cpendorder> {

	@Override
	public Cpendorder mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cpendorder obj = new Cpendorder();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
