package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgrptpc;

public class CatgrptpcRowMapper<T> implements RowMapper<Catgrptpc> {

	@Override
	public Catgrptpc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgrptpc obj = new Catgrptpc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
