package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLGPPOL;

public class ACPOLGPPOLRowMapper<T> implements RowMapper<ACPOLGPPOL> {

    private static final Logger log = Logger.getLogger(ACPOLGPPOLRowMapper.class);

	@Override
	public ACPOLGPPOL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLGPPOL obj = new ACPOLGPPOL();
		
		obj.setACPOLICY_ID(rs.getBigDecimal("ACPOLICY_ID"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
