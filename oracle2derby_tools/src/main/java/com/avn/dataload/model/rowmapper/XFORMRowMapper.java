package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM;

public class XFORMRowMapper<T> implements RowMapper<XFORM> {

	@Override
	public XFORM mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM obj = new XFORM();
		
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_NM(rs.getString("FORM_NM"));
		obj.setFORM_TYPE_CD(rs.getString("FORM_TYPE_CD"));
		
		return obj;
	}

}
