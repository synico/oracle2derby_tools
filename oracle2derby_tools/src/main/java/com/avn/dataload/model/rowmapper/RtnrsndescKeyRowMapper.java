package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.RtnrsndescKey;

public class RtnrsndescKeyRowMapper<T> implements RowMapper<RtnrsndescKey> {

	@Override
	public RtnrsndescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		RtnrsndescKey obj = new RtnrsndescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRtnreasonId(rs.getBigDecimal("RTNREASON_ID"));
		
		return obj;
	}

}
