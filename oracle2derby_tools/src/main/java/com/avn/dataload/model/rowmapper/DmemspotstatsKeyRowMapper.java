package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmemspotstatsKey;

public class DmemspotstatsKeyRowMapper<T> implements RowMapper<DmemspotstatsKey> {

	@Override
	public DmemspotstatsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmemspotstatsKey obj = new DmemspotstatsKey();
		
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setEmspotId(rs.getBigDecimal("EMSPOT_ID"));
		
		return obj;
	}

}
