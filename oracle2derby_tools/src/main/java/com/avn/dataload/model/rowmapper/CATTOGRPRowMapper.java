package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATTOGRP;

public class CATTOGRPRowMapper<T> implements RowMapper<CATTOGRP> {

    private static final Logger log = Logger.getLogger(CATTOGRPRowMapper.class);

	@Override
	public CATTOGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATTOGRP obj = new CATTOGRP();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setCATALOG_ID_LINK(rs.getBigDecimal("CATALOG_ID_LINK"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
