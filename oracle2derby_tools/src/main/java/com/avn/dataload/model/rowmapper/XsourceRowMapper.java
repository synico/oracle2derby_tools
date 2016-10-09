package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsource;

public class XsourceRowMapper<T> implements RowMapper<Xsource> {

	@Override
	public Xsource mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsource obj = new Xsource();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSourceId(rs.getBigDecimal("SOURCE_ID"));
		obj.setSourceName(rs.getString("SOURCE_NAME"));
		
		return obj;
	}

}
