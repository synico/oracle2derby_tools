package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestionLanguageKey;

public class XformQuestionLanguageKeyRowMapper<T> implements RowMapper<XformQuestionLanguageKey> {

	@Override
	public XformQuestionLanguageKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestionLanguageKey obj = new XformQuestionLanguageKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormQuestionId(rs.getBigDecimal("FORM_QUESTION_ID"));
		
		return obj;
	}

}
