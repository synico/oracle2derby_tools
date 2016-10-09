package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Numbrusg;

public class NumbrusgRowMapper<T> implements RowMapper<Numbrusg> {

	@Override
	public Numbrusg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Numbrusg obj = new Numbrusg();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
