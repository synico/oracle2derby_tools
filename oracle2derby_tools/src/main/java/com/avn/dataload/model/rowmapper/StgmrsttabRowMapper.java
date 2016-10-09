package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stgmrsttab;

public class StgmrsttabRowMapper<T> implements RowMapper<Stgmrsttab> {

	@Override
	public Stgmrsttab mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stgmrsttab obj = new Stgmrsttab();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTabnbr(rs.getBigDecimal("TABNBR"));
		obj.setTabname(rs.getString("TABNAME"));
		obj.setColname(rs.getString("COLNAME"));
		
		return obj;
	}

}
