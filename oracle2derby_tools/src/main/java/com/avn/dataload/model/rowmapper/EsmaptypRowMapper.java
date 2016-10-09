package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Esmaptyp;

public class EsmaptypRowMapper<T> implements RowMapper<Esmaptyp> {

	@Override
	public Esmaptyp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Esmaptyp obj = new Esmaptyp();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setEsmaptypId(rs.getBigDecimal("ESMAPTYP_ID"));
		
		return obj;
	}

}
