package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidgetnvp;

public class PlwidgetnvpRowMapper<T> implements RowMapper<Plwidgetnvp> {

	@Override
	public Plwidgetnvp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidgetnvp obj = new Plwidgetnvp();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setPlwidgetnvpId(rs.getBigDecimal("PLWIDGETNVP_ID"));
		obj.setPlwidgetId(rs.getBigDecimal("PLWIDGET_ID"));
		
		return obj;
	}

}
