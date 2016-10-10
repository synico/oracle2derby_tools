package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_QUESTION_SET_REL;

public class XFORM_QUESTION_SET_RELRowMapper<T> implements RowMapper<XFORM_QUESTION_SET_REL> {

	@Override
	public XFORM_QUESTION_SET_REL mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_QUESTION_SET_REL obj = new XFORM_QUESTION_SET_REL();
		
		obj.setDISPLAY_FL(rs.getString("DISPLAY_FL"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFORM_QUESTION_SET_ID(rs.getBigDecimal("FORM_QUESTION_SET_ID"));
		obj.setCSS_STYLE_TX(rs.getBigDecimal("CSS_STYLE_TX"));
		
		return obj;
	}

}
