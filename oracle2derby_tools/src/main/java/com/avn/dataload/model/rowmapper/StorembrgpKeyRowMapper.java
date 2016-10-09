package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorembrgpKey;

public class StorembrgpKeyRowMapper<T> implements RowMapper<StorembrgpKey> {

	@Override
	public StorembrgpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorembrgpKey obj = new StorembrgpKey();
		
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
