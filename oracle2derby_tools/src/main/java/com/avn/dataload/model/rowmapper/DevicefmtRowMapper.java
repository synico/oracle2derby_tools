package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Devicefmt;

public class DevicefmtRowMapper<T> implements RowMapper<Devicefmt> {

	@Override
	public Devicefmt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Devicefmt obj = new Devicefmt();
		
		obj.setDevicetypeId(rs.getString("DEVICETYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDevicefmtId(rs.getBigDecimal("DEVICEFMT_ID"));
		
		return obj;
	}

}
