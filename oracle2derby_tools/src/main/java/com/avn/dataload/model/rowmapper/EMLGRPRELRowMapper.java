package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLGRPREL;

public class EMLGRPRELRowMapper<T> implements RowMapper<EMLGRPREL> {

	@Override
	public EMLGRPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLGRPREL obj = new EMLGRPREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		
		return obj;
	}

}
