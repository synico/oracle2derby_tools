package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_ANSWER;

public class XFORM_ANSWERRowMapper<T> implements RowMapper<XFORM_ANSWER> {

    private static final Logger log = Logger.getLogger(XFORM_ANSWERRowMapper.class);

	@Override
	public XFORM_ANSWER mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_ANSWER obj = new XFORM_ANSWER();
		
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFORM_RESPONSE_ID(rs.getBigDecimal("FORM_RESPONSE_ID"));
		obj.setFORM_ANSWER_TX(rs.getString("FORM_ANSWER_TX"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
