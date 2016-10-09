package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorecatovrgrpKey;

public class StorecatovrgrpKeyRowMapper<T> implements RowMapper<StorecatovrgrpKey> {

	@Override
	public StorecatovrgrpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorecatovrgrpKey obj = new StorecatovrgrpKey();
		
		obj.setCatovrgrpId(rs.getBigDecimal("CATOVRGRP_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
