package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchconfext;

public class SrchconfextRowMapper<T> implements RowMapper<Srchconfext> {

	@Override
	public Srchconfext mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchconfext obj = new Srchconfext();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSrchconfextId(rs.getBigDecimal("SRCHCONFEXT_ID"));
		obj.setIndexsubtype(rs.getString("INDEXSUBTYPE"));
		obj.setIndexscope(rs.getString("INDEXSCOPE"));
		obj.setIndextype(rs.getString("INDEXTYPE"));
		obj.setConfig(rs.getString("CONFIG"));
		
		return obj;
	}

}
