package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcacgpdescKey;

public class AcacgpdescKeyRowMapper<T> implements RowMapper<AcacgpdescKey> {

	@Override
	public AcacgpdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcacgpdescKey obj = new AcacgpdescKey();
		
		obj.setAcactgrpId(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
