package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLGRP;

public class ACPOLGRPRowMapper<T> implements RowMapper<ACPOLGRP> {

    private static final Logger log = Logger.getLogger(ACPOLGRPRowMapper.class);

	@Override
	public ACPOLGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLGRP obj = new ACPOLGRP();
		
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
