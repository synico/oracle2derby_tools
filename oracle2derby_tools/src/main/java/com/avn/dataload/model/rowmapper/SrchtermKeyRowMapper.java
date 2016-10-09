package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SrchtermKey;

public class SrchtermKeyRowMapper<T> implements RowMapper<SrchtermKey> {

	@Override
	public SrchtermKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SrchtermKey obj = new SrchtermKey();
		
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setSrchtermassocId(rs.getBigDecimal("SRCHTERMASSOC_ID"));
		obj.setTerm(rs.getString("TERM"));
		
		return obj;
	}

}
