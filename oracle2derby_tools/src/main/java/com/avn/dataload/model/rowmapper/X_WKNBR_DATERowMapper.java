package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_WKNBR_DATE;

public class X_WKNBR_DATERowMapper<T> implements RowMapper<X_WKNBR_DATE> {

    private static final Logger log = Logger.getLogger(X_WKNBR_DATERowMapper.class);

	@Override
	public X_WKNBR_DATE mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_WKNBR_DATE obj = new X_WKNBR_DATE();
		
		obj.setWEEK_NBR(rs.getString("WEEK_NBR"));
		obj.setWEEK_BEGIN_DATE(rs.getTimestamp("WEEK_BEGIN_DATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
