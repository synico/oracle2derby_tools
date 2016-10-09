package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Fldomndesc;

public class FldomndescRowMapper<T> implements RowMapper<Fldomndesc> {

	@Override
	public Fldomndesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fldomndesc obj = new Fldomndesc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
