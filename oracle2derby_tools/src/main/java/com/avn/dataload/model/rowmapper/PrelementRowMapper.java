package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Prelement;

public class PrelementRowMapper<T> implements RowMapper<Prelement> {

	@Override
	public Prelement mapRow(ResultSet rs, int rowNum) throws SQLException {
		Prelement obj = new Prelement();
		
		obj.setParent(rs.getString("PARENT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPrelementId(rs.getBigDecimal("PRELEMENT_ID"));
		obj.setPreletemplateId(rs.getBigDecimal("PRELETEMPLATE_ID"));
		obj.setPriceruleId(rs.getBigDecimal("PRICERULE_ID"));
		
		return obj;
	}

}
