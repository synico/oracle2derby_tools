package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformOptionKey;

public class XformOptionKeyRowMapper<T> implements RowMapper<XformOptionKey> {

	@Override
	public XformOptionKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformOptionKey obj = new XformOptionKey();
		
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormVersionId(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFormQuestionId(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFormOptionId(rs.getBigDecimal("FORM_OPTION_ID"));
		
		return obj;
	}

}
