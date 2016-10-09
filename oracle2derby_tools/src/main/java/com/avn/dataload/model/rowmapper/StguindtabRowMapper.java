package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stguindtab;

public class StguindtabRowMapper<T> implements RowMapper<Stguindtab> {

	@Override
	public Stguindtab mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stguindtab obj = new Stguindtab();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTabname(rs.getString("TABNAME"));
		
		return obj;
	}

}
