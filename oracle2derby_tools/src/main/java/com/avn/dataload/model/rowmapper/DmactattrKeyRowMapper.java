package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmactattrKey;

public class DmactattrKeyRowMapper<T> implements RowMapper<DmactattrKey> {

	@Override
	public DmactattrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmactattrKey obj = new DmactattrKey();
		
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
