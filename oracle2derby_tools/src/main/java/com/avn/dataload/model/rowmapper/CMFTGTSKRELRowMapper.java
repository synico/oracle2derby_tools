package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTGTSKREL;

public class CMFTGTSKRELRowMapper<T> implements RowMapper<CMFTGTSKREL> {

	@Override
	public CMFTGTSKREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTGTSKREL obj = new CMFTGTSKREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCMFTASK_ID(rs.getBigDecimal("CMFTASK_ID"));
		obj.setCMFTASKGRP_ID(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		return obj;
	}

}
