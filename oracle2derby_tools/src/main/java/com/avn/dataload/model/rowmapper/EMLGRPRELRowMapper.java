package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLGRPREL;

public class EMLGRPRELRowMapper<T> implements RowMapper<EMLGRPREL> {

    private static final Logger log = Logger.getLogger(EMLGRPRELRowMapper.class);

	@Override
	public EMLGRPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLGRPREL obj = new EMLGRPREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
