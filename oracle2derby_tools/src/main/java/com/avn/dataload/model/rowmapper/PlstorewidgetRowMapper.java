package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plstorewidget;

public class PlstorewidgetRowMapper<T> implements RowMapper<Plstorewidget> {

	@Override
	public Plstorewidget mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plstorewidget obj = new Plstorewidget();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPlstorewidgetId(rs.getBigDecimal("PLSTOREWIDGET_ID"));
		obj.setPlwidgetdefId(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setDefinitionxml(rs.getString("DEFINITIONXML"));
		
		return obj;
	}

}
