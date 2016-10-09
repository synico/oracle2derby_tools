package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Busevent;

public class BuseventRowMapper<T> implements RowMapper<Busevent> {

	@Override
	public Busevent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Busevent obj = new Busevent();
		
		obj.setCreatetstmp(rs.getDate("CREATETSTMP"));
		obj.setEventSearchkey(rs.getString("EVENT_SEARCHKEY"));
		obj.setEventdata(rs.getString("EVENTDATA"));
		obj.setChecked(rs.getBigDecimal("CHECKED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
