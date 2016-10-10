package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_QUESTION_LANGUAGE;

public class XFORM_QUESTION_LANGUAGERowMapper<T> implements RowMapper<XFORM_QUESTION_LANGUAGE> {

	@Override
	public XFORM_QUESTION_LANGUAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_QUESTION_LANGUAGE obj = new XFORM_QUESTION_LANGUAGE();
		
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFORM_QUESTION_TX(rs.getString("FORM_QUESTION_TX"));
		
		return obj;
	}

}
