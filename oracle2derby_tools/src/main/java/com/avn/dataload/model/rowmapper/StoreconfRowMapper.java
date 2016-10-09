package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storeconf;

public class StoreconfRowMapper<T> implements RowMapper<Storeconf> {

	@Override
	public Storeconf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storeconf obj = new Storeconf();
		
		obj.setValue(rs.getString("VALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
