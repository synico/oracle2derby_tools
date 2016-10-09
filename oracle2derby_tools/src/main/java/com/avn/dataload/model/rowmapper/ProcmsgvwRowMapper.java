package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Procmsgvw;

public class ProcmsgvwRowMapper<T> implements RowMapper<Procmsgvw> {

	@Override
	public Procmsgvw mapRow(ResultSet rs, int rowNum) throws SQLException {
		Procmsgvw obj = new Procmsgvw();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setErrorview(rs.getString("ERRORVIEW"));
		obj.setViewname(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
