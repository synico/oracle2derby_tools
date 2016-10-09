package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresrel;

public class AcresrelRowMapper<T> implements RowMapper<Acresrel> {

	@Override
	public Acresrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresrel obj = new Acresrel();
		
		obj.setResrelmemcol(rs.getString("RESRELMEMCOL"));
		obj.setResrelkeycol(rs.getString("RESRELKEYCOL"));
		obj.setResourcetype(rs.getString("RESOURCETYPE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setResrelcol(rs.getString("RESRELCOL"));
		obj.setResjoincol(rs.getString("RESJOINCOL"));
		obj.setResreltable(rs.getString("RESRELTABLE"));
		
		return obj;
	}

}
