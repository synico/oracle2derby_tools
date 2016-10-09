package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.RtndnydescKey;

public class RtndnydescKeyRowMapper<T> implements RowMapper<RtndnydescKey> {

	@Override
	public RtndnydescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		RtndnydescKey obj = new RtndnydescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRtndnyrsnId(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		return obj;
	}

}
