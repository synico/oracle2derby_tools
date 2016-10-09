package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgpenrel;

public class CatgpenrelRowMapper<T> implements RowMapper<Catgpenrel> {

	@Override
	public Catgpenrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgpenrel obj = new Catgpenrel();
		
		obj.setRule(rs.getString("RULE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
