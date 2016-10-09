package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformAnswer;

public class XformAnswerRowMapper<T> implements RowMapper<XformAnswer> {

	@Override
	public XformAnswer mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformAnswer obj = new XformAnswer();
		
		obj.setFormAnswerTx(rs.getString("FORM_ANSWER_TX"));
		
		return obj;
	}

}
