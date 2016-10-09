package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storecntr;

public class StorecntrRowMapper<T> implements RowMapper<Storecntr> {

	@Override
	public Storecntr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storecntr obj = new Storecntr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
