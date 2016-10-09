package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcresgpresKey;

public class AcresgpresKeyRowMapper<T> implements RowMapper<AcresgpresKey> {

	@Override
	public AcresgpresKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcresgpresKey obj = new AcresgpresKey();
		
		obj.setAcresgrpId(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		
		return obj;
	}

}
