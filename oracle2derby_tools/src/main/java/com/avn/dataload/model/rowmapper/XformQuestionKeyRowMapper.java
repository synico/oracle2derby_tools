package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestionKey;

public class XformQuestionKeyRowMapper<T> implements RowMapper<XformQuestionKey> {

	@Override
	public XformQuestionKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestionKey obj = new XformQuestionKey();
		
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormQuestionId(rs.getBigDecimal("FORM_QUESTION_ID"));
		
		return obj;
	}

}
