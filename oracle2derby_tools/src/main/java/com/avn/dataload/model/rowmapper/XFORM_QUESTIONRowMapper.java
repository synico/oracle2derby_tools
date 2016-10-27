package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_QUESTION;

public class XFORM_QUESTIONRowMapper<T> implements RowMapper<XFORM_QUESTION> {

    private static final Logger log = Logger.getLogger(XFORM_QUESTIONRowMapper.class);

	@Override
	public XFORM_QUESTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_QUESTION obj = new XFORM_QUESTION();
		
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setSORT_ORDER_NO(rs.getBigDecimal("SORT_ORDER_NO"));
		obj.setFORM_QUESTION_TYPE_CD(rs.getString("FORM_QUESTION_TYPE_CD"));
		obj.setFORM_QUESTION_SET_ID(rs.getBigDecimal("FORM_QUESTION_SET_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
