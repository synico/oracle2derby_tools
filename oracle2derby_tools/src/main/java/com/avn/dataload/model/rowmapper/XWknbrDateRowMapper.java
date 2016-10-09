package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XWknbrDate;

public class XWknbrDateRowMapper<T> implements RowMapper<XWknbrDate> {

	@Override
	public XWknbrDate mapRow(ResultSet rs, int rowNum) throws SQLException {
		XWknbrDate obj = new XWknbrDate();
		
		obj.setWeekBeginDate(rs.getDate("WEEK_BEGIN_DATE"));
		obj.setWeekNbr(rs.getString("WEEK_NBR"));
		
		return obj;
	}

}
