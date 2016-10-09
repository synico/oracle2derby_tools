package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestionSetRelKey;

public class XformQuestionSetRelKeyRowMapper<T> implements RowMapper<XformQuestionSetRelKey> {

	@Override
	public XformQuestionSetRelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestionSetRelKey obj = new XformQuestionSetRelKey();
		
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormQuestionId(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFormQuestionSetId(rs.getBigDecimal("FORM_QUESTION_SET_ID"));
		
		return obj;
	}

}
