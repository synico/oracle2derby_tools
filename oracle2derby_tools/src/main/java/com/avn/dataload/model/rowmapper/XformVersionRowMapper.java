package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformVersion;

public class XformVersionRowMapper<T> implements RowMapper<XformVersion> {

	@Override
	public XformVersion mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformVersion obj = new XformVersion();
		
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setFormVersionDs(rs.getString("FORM_VERSION_DS"));
		
		return obj;
	}

}
