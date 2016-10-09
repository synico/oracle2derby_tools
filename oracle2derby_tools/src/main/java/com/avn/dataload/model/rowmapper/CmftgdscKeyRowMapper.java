package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmftgdscKey;

public class CmftgdscKeyRowMapper<T> implements RowMapper<CmftgdscKey> {

	@Override
	public CmftgdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmftgdscKey obj = new CmftgdscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCmftaskgrpId(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		return obj;
	}

}
