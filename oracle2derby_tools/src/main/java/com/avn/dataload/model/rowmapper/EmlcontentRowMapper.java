package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlcontent;

public class EmlcontentRowMapper<T> implements RowMapper<Emlcontent> {

	@Override
	public Emlcontent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlcontent obj = new Emlcontent();
		
		obj.setEmlcontentId(rs.getBigDecimal("EMLCONTENT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastmodify(rs.getDate("LASTMODIFY"));
		obj.setRecordopen(rs.getBigDecimal("RECORDOPEN"));
		obj.setEmlsubject(rs.getString("EMLSUBJECT"));
		obj.setEmlbody(rs.getString("EMLBODY"));
		
		return obj;
	}

}
