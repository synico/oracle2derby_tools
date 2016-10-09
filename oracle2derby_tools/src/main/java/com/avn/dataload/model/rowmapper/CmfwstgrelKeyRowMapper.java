package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmfwstgrelKey;

public class CmfwstgrelKeyRowMapper<T> implements RowMapper<CmfwstgrelKey> {

	@Override
	public CmfwstgrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmfwstgrelKey obj = new CmfwstgrelKey();
		
		obj.setCmfwkspcId(rs.getBigDecimal("CMFWKSPC_ID"));
		obj.setCmftaskgrpId(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		return obj;
	}

}
