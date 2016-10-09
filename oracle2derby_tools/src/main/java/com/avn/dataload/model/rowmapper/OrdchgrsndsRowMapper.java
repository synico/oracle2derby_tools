package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordchgrsnds;

public class OrdchgrsndsRowMapper<T> implements RowMapper<Ordchgrsnds> {

	@Override
	public Ordchgrsnds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordchgrsnds obj = new Ordchgrsnds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
