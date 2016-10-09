package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Buschn;

public class BuschnRowMapper<T> implements RowMapper<Buschn> {

	@Override
	public Buschn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Buschn obj = new Buschn();
		
		obj.setState(rs.getString("STATE"));
		obj.setName(rs.getString("NAME"));
		obj.setBuschnId(rs.getBigDecimal("BUSCHN_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
