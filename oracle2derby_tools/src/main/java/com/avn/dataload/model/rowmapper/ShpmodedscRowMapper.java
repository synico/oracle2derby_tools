package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Shpmodedsc;

public class ShpmodedscRowMapper<T> implements RowMapper<Shpmodedsc> {

	@Override
	public Shpmodedsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Shpmodedsc obj = new Shpmodedsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
