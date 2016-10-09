package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Policytc;

public class PolicytcRowMapper<T> implements RowMapper<Policytc> {

	@Override
	public Policytc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Policytc obj = new Policytc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
