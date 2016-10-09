package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcactactgpKey;

public class AcactactgpKeyRowMapper<T> implements RowMapper<AcactactgpKey> {

	@Override
	public AcactactgpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcactactgpKey obj = new AcactactgpKey();
		
		obj.setAcactgrpId(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setAcactionId(rs.getBigDecimal("ACACTION_ID"));
		
		return obj;
	}

}
