package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlpolicy;

public class EmlpolicyRowMapper<T> implements RowMapper<Emlpolicy> {

	@Override
	public Emlpolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlpolicy obj = new Emlpolicy();
		
		obj.setEmlpolicyId(rs.getBigDecimal("EMLPOLICY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNumretries(rs.getBigDecimal("NUMRETRIES"));
		obj.setInterval(rs.getBigDecimal("INTERVAL"));
		
		return obj;
	}

}
