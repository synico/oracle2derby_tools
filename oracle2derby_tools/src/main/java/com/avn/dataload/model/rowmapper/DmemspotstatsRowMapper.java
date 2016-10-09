package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmemspotstats;

public class DmemspotstatsRowMapper<T> implements RowMapper<Dmemspotstats> {

	@Override
	public Dmemspotstats mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmemspotstats obj = new Dmemspotstats();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setViews(rs.getBigDecimal("VIEWS"));
		obj.setClicks(rs.getBigDecimal("CLICKS"));
		
		return obj;
	}

}
