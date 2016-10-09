package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storlangds;

public class StorlangdsRowMapper<T> implements RowMapper<Storlangds> {

	@Override
	public Storlangds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storlangds obj = new Storlangds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
