package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorblkrsnKey;

public class StorblkrsnKeyRowMapper<T> implements RowMapper<StorblkrsnKey> {

	@Override
	public StorblkrsnKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorblkrsnKey obj = new StorblkrsnKey();
		
		obj.setBlkrsncodeId(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
