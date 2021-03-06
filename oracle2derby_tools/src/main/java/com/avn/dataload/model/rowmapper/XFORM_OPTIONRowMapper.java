package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_OPTION;

public class XFORM_OPTIONRowMapper<T> implements RowMapper<XFORM_OPTION> {

    private static final Logger log = Logger.getLogger(XFORM_OPTIONRowMapper.class);

	@Override
	public XFORM_OPTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_OPTION obj = new XFORM_OPTION();
		
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFORM_OPTION_ID(rs.getBigDecimal("FORM_OPTION_ID"));
		obj.setSORT_ORDER_NO(rs.getBigDecimal("SORT_ORDER_NO"));
		obj.setDEPENDENT_QUESTION_SET_ID(rs.getBigDecimal("DEPENDENT_QUESTION_SET_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
