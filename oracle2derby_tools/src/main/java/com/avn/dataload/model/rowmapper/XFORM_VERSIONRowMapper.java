package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_VERSION;

public class XFORM_VERSIONRowMapper<T> implements RowMapper<XFORM_VERSION> {

	@Override
	public XFORM_VERSION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_VERSION obj = new XFORM_VERSION();
		
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_VERSION_DS(rs.getString("FORM_VERSION_DS"));
		
		return obj;
	}

}
