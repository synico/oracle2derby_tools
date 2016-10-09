package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BuseventKey;

public class BuseventKeyRowMapper<T> implements RowMapper<BuseventKey> {

	@Override
	public BuseventKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		BuseventKey obj = new BuseventKey();
		
		obj.setBuseventId(rs.getBigDecimal("BUSEVENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
