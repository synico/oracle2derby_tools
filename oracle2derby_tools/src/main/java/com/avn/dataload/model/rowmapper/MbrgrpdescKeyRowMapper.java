package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MbrgrpdescKey;

public class MbrgrpdescKeyRowMapper<T> implements RowMapper<MbrgrpdescKey> {

	@Override
	public MbrgrpdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MbrgrpdescKey obj = new MbrgrpdescKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
