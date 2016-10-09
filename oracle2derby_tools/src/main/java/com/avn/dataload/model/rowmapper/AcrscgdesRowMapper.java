package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acrscgdes;

public class AcrscgdesRowMapper<T> implements RowMapper<Acrscgdes> {

	@Override
	public Acrscgdes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acrscgdes obj = new Acrscgdes();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
