package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestion;

public class XformQuestionRowMapper<T> implements RowMapper<XformQuestion> {

	@Override
	public XformQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestion obj = new XformQuestion();
		
		obj.setSortOrderNo(rs.getBigDecimal("SORT_ORDER_NO"));
		obj.setFormQuestionTypeCd(rs.getString("FORM_QUESTION_TYPE_CD"));
		obj.setFormQuestionSetId(rs.getBigDecimal("FORM_QUESTION_SET_ID"));
		
		return obj;
	}

}
