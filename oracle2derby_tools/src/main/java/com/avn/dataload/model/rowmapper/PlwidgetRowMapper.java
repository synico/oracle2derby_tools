package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidget;

public class PlwidgetRowMapper<T> implements RowMapper<Plwidget> {

	@Override
	public Plwidget mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidget obj = new Plwidget();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setPagelayoutId(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPlwidgetdefId(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setAdminname(rs.getString("ADMINNAME"));
		obj.setPlwidgetId(rs.getBigDecimal("PLWIDGET_ID"));
		obj.setSlotid(rs.getString("SLOTID"));
		
		return obj;
	}

}
