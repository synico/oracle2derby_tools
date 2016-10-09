package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestionLanguage;

public class XformQuestionLanguageRowMapper<T> implements RowMapper<XformQuestionLanguage> {

	@Override
	public XformQuestionLanguage mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestionLanguage obj = new XformQuestionLanguage();
		
		obj.setFormQuestionTx(rs.getString("FORM_QUESTION_TX"));
		
		return obj;
	}

}
