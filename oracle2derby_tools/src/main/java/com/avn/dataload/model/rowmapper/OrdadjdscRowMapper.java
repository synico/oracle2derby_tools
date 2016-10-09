package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordadjdsc;

public class OrdadjdscRowMapper<T> implements RowMapper<Ordadjdsc> {

	@Override
	public Ordadjdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordadjdsc obj = new Ordadjdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}