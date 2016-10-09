package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plwidgetslot;

public class PlwidgetslotRowMapper<T> implements RowMapper<Plwidgetslot> {

	@Override
	public Plwidgetslot mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plwidgetslot obj = new Plwidgetslot();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPagelayoutId(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPlwidgetslotId(rs.getBigDecimal("PLWIDGETSLOT_ID"));
		obj.setAdminname(rs.getString("ADMINNAME"));
		obj.setPlwidgetId(rs.getBigDecimal("PLWIDGET_ID"));
		obj.setSlotid(rs.getString("SLOTID"));
		obj.setSlottype(rs.getBigDecimal("SLOTTYPE"));
		
		return obj;
	}

}
