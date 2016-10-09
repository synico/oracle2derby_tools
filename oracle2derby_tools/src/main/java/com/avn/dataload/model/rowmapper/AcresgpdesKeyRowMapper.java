package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcresgpdesKey;

public class AcresgpdesKeyRowMapper<T> implements RowMapper<AcresgpdesKey> {

	@Override
	public AcresgpdesKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcresgpdesKey obj = new AcresgpdesKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcresgrpId(rs.getBigDecimal("ACRESGRP_ID"));
		
		return obj;
	}

}
