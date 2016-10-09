package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Massoctype;

public class MassoctypeRowMapper<T> implements RowMapper<Massoctype> {

	@Override
	public Massoctype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Massoctype obj = new Massoctype();
		
		obj.setOid(rs.getString("OID"));
		obj.setMassoctypeId(rs.getString("MASSOCTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
