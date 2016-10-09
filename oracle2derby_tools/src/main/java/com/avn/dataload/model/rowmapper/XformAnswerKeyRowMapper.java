package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformAnswerKey;

public class XformAnswerKeyRowMapper<T> implements RowMapper<XformAnswerKey> {

	@Override
	public XformAnswerKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformAnswerKey obj = new XformAnswerKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormQuestionId(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFormResponseId(rs.getBigDecimal("FORM_RESPONSE_ID"));
		
		return obj;
	}

}
