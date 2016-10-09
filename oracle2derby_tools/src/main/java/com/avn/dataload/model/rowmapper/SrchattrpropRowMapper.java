package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchattrprop;

public class SrchattrpropRowMapper<T> implements RowMapper<Srchattrprop> {

	@Override
	public Srchattrprop mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchattrprop obj = new Srchattrprop();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPropertyvalue(rs.getString("PROPERTYVALUE"));
		
		return obj;
	}

}
