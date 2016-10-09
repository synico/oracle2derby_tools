package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Subscptype;

public class SubscptypeRowMapper<T> implements RowMapper<Subscptype> {

	@Override
	public Subscptype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Subscptype obj = new Subscptype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setSubscptypeId(rs.getString("SUBSCPTYPE_ID"));
		
		return obj;
	}

}
