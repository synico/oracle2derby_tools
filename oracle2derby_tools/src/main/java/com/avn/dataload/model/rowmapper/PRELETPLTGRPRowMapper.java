package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELETPLTGRP;

public class PRELETPLTGRPRowMapper<T> implements RowMapper<PRELETPLTGRP> {

	@Override
	public PRELETPLTGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELETPLTGRP obj = new PRELETPLTGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPRELETPLTGRP_ID(rs.getBigDecimal("PRELETPLTGRP_ID"));
		
		return obj;
	}

}
