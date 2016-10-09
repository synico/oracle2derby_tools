package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmftgtskrelKey;

public class CmftgtskrelKeyRowMapper<T> implements RowMapper<CmftgtskrelKey> {

	@Override
	public CmftgtskrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmftgtskrelKey obj = new CmftgtskrelKey();
		
		obj.setCmftaskId(rs.getBigDecimal("CMFTASK_ID"));
		obj.setCmftaskgrpId(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		return obj;
	}

}
