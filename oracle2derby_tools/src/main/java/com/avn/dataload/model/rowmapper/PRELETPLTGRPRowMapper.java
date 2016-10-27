package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELETPLTGRP;

public class PRELETPLTGRPRowMapper<T> implements RowMapper<PRELETPLTGRP> {

    private static final Logger log = Logger.getLogger(PRELETPLTGRPRowMapper.class);

	@Override
	public PRELETPLTGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELETPLTGRP obj = new PRELETPLTGRP();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRELETPLTGRP_ID(rs.getBigDecimal("PRELETPLTGRP_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
