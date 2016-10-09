package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmmbrgrppznKey;

public class DmmbrgrppznKeyRowMapper<T> implements RowMapper<DmmbrgrppznKey> {

	@Override
	public DmmbrgrppznKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmmbrgrppznKey obj = new DmmbrgrppznKey();
		
		obj.setPersonalizationid(rs.getString("PERSONALIZATIONID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
