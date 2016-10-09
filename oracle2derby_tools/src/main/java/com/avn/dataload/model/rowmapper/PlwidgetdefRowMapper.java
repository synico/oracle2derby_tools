package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidgetdef;

public class PlwidgetdefRowMapper<T> implements RowMapper<Plwidgetdef> {

	@Override
	public Plwidgetdef mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidgetdef obj = new Plwidgetdef();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setPlwidgetdefId(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setDefinitionxml(rs.getString("DEFINITIONXML"));
		obj.setUiObjectName(rs.getString("UI_OBJECT_NAME"));
		obj.setCreatedate(rs.getDate("CREATEDATE"));
		obj.setVendor(rs.getString("VENDOR"));
		obj.setWidgettype(rs.getBigDecimal("WIDGETTYPE"));
		obj.setJsppath(rs.getString("JSPPATH"));
		
		return obj;
	}

}
