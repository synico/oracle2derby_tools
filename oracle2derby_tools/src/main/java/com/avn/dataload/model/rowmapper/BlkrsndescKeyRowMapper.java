package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BlkrsndescKey;

public class BlkrsndescKeyRowMapper<T> implements RowMapper<BlkrsndescKey> {

	@Override
	public BlkrsndescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		BlkrsndescKey obj = new BlkrsndescKey();
		
		obj.setBlkrsncodeId(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
