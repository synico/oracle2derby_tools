package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storecent;

public class StorecentRowMapper<T> implements RowMapper<Storecent> {

	@Override
	public Storecent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storecent obj = new Storecent();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
