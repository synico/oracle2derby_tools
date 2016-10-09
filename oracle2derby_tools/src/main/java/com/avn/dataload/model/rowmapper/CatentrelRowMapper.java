package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catentrel;

public class CatentrelRowMapper<T> implements RowMapper<Catentrel> {

	@Override
	public Catentrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catentrel obj = new Catentrel();
		
		obj.setOid(rs.getString("OID"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setMandatory(rs.getString("MANDATORY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setGroupname(rs.getString("GROUPNAME"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
