package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xmanfoverride;

public class XmanfoverrideRowMapper<T> implements RowMapper<Xmanfoverride> {

	@Override
	public Xmanfoverride mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xmanfoverride obj = new Xmanfoverride();
		
		obj.setLastupdated(rs.getDate("LASTUPDATED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setOverride(rs.getString("OVERRIDE"));
		
		return obj;
	}

}
