package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Curformat;

public class CurformatRowMapper<T> implements RowMapper<Curformat> {

	@Override
	public Curformat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Curformat obj = new Curformat();
		
		obj.setMinapproveamount(rs.getBigDecimal("MINAPPROVEAMOUNT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRoundingmultiple(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setRoundingmethod(rs.getString("ROUNDINGMETHOD"));
		obj.setDecimalplaces(rs.getBigDecimal("DECIMALPLACES"));
		
		return obj;
	}

}
