package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECGRP;

public class STORECGRPRowMapper<T> implements RowMapper<STORECGRP> {

    private static final Logger log = Logger.getLogger(STORECGRPRowMapper.class);

	@Override
	public STORECGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECGRP obj = new STORECGRP();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
