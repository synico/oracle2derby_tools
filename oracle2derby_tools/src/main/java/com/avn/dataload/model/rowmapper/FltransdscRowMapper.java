package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Fltransdsc;

public class FltransdscRowMapper<T> implements RowMapper<Fltransdsc> {

	@Override
	public Fltransdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fltransdsc obj = new Fltransdsc();
		
		obj.setTransitiondesc(rs.getString("TRANSITIONDESC"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEventdesc(rs.getString("EVENTDESC"));
		
		return obj;
	}

}
