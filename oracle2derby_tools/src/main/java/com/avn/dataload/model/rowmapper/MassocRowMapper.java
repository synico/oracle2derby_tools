package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Massoc;

public class MassocRowMapper<T> implements RowMapper<Massoc> {

	@Override
	public Massoc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Massoc obj = new Massoc();
		
		obj.setOid(rs.getString("OID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMassocId(rs.getString("MASSOC_ID"));
		
		return obj;
	}

}
