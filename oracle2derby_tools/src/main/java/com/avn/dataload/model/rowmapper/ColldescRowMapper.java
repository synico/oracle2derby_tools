package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Colldesc;

public class ColldescRowMapper<T> implements RowMapper<Colldesc> {

	@Override
	public Colldesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Colldesc obj = new Colldesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setLocation(rs.getString("LOCATION"));
		obj.setMarketingtext(rs.getString("MARKETINGTEXT"));
		obj.setLongmktgtext(rs.getString("LONGMKTGTEXT"));
		
		return obj;
	}

}
