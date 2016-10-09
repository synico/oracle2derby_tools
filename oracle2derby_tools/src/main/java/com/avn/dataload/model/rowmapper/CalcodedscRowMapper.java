package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calcodedsc;

public class CalcodedscRowMapper<T> implements RowMapper<Calcodedsc> {

	@Override
	public Calcodedsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calcodedsc obj = new Calcodedsc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
