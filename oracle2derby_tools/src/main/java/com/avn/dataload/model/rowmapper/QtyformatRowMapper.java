package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Qtyformat;

public class QtyformatRowMapper<T> implements RowMapper<Qtyformat> {

	@Override
	public Qtyformat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Qtyformat obj = new Qtyformat();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRoundingmultiple(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setRoundingmethod(rs.getString("ROUNDINGMETHOD"));
		obj.setDecimalplaces(rs.getBigDecimal("DECIMALPLACES"));
		
		return obj;
	}

}
