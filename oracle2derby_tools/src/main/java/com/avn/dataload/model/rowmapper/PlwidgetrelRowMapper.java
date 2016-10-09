package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidgetrel;

public class PlwidgetrelRowMapper<T> implements RowMapper<Plwidgetrel> {

	@Override
	public Plwidgetrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidgetrel obj = new Plwidgetrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setPlwidgetIdChild(rs.getBigDecimal("PLWIDGET_ID_CHILD"));
		obj.setPlwidgetIdParent(rs.getBigDecimal("PLWIDGET_ID_PARENT"));
		
		return obj;
	}

}
