package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stgmertab;

public class StgmertabRowMapper<T> implements RowMapper<Stgmertab> {

	@Override
	public Stgmertab mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stgmertab obj = new Stgmertab();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUpdatableUkCol(rs.getString("UPDATABLE_UK_COL"));
		obj.setTabnbr(rs.getBigDecimal("TABNBR"));
		obj.setTabname(rs.getString("TABNAME"));
		
		return obj;
	}

}
