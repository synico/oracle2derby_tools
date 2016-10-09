package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformQuestionSetRel;

public class XformQuestionSetRelRowMapper<T> implements RowMapper<XformQuestionSetRel> {

	@Override
	public XformQuestionSetRel mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformQuestionSetRel obj = new XformQuestionSetRel();
		
		obj.setDisplayFl(rs.getString("DISPLAY_FL"));
		obj.setCssStyleTx(rs.getBigDecimal("CSS_STYLE_TX"));
		
		return obj;
	}

}
