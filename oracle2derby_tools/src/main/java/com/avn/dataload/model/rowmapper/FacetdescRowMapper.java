package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Facetdesc;

public class FacetdescRowMapper<T> implements RowMapper<Facetdesc> {

	@Override
	public Facetdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Facetdesc obj = new Facetdesc();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
