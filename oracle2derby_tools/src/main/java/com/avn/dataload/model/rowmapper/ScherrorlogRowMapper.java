package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Scherrorlog;

public class ScherrorlogRowMapper<T> implements RowMapper<Scherrorlog> {

	@Override
	public Scherrorlog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Scherrorlog obj = new Scherrorlog();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setScsinstrefnum(rs.getBigDecimal("SCSINSTREFNUM"));
		obj.setScserror(rs.getString("SCSERROR"));
		
		return obj;
	}

}
