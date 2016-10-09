package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catreltype;

public class CatreltypeRowMapper<T> implements RowMapper<Catreltype> {

	@Override
	public Catreltype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catreltype obj = new Catreltype();
		
		obj.setCatreltypeId(rs.getString("CATRELTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
