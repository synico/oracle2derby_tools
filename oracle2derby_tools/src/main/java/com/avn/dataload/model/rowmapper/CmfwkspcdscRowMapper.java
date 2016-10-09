package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmfwkspcdsc;

public class CmfwkspcdscRowMapper<T> implements RowMapper<Cmfwkspcdsc> {

	@Override
	public Cmfwkspcdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmfwkspcdsc obj = new Cmfwkspcdsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
