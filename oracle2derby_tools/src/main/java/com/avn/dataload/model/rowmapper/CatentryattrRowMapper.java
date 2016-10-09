package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catentryattr;

public class CatentryattrRowMapper<T> implements RowMapper<Catentryattr> {

	@Override
	public Catentryattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catentryattr obj = new Catentryattr();
		
		obj.setUsage(rs.getString("USAGE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
