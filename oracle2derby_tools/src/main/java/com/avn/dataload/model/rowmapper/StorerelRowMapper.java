package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storerel;

public class StorerelRowMapper<T> implements RowMapper<Storerel> {

	@Override
	public Storerel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storerel obj = new Storerel();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
