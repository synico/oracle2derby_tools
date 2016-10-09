package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flstdctdsc;

public class FlstdctdscRowMapper<T> implements RowMapper<Flstdctdsc> {

	@Override
	public Flstdctdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flstdctdsc obj = new Flstdctdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
