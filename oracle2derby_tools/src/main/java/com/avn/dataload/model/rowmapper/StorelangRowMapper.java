package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storelang;

public class StorelangRowMapper<T> implements RowMapper<Storelang> {

	@Override
	public Storelang mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storelang obj = new Storelang();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
