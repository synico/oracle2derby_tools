package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECATOVRGRP;

public class STORECATOVRGRPRowMapper<T> implements RowMapper<STORECATOVRGRP> {

    private static final Logger log = Logger.getLogger(STORECATOVRGRPRowMapper.class);

	@Override
	public STORECATOVRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECATOVRGRP obj = new STORECATOVRGRP();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATOVRGRP_ID(rs.getBigDecimal("CATOVRGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
