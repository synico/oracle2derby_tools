package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Trdtypedsc;

public class TrdtypedscRowMapper<T> implements RowMapper<Trdtypedsc> {

	@Override
	public Trdtypedsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trdtypedsc obj = new Trdtypedsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
