package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcplgpdescKey;

public class AcplgpdescKeyRowMapper<T> implements RowMapper<AcplgpdescKey> {

	@Override
	public AcplgpdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcplgpdescKey obj = new AcplgpdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAcpolgrpId(rs.getBigDecimal("ACPOLGRP_ID"));
		
		return obj;
	}

}
