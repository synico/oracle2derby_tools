package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACACTACTGP;

public class ACACTACTGPRowMapper<T> implements RowMapper<ACACTACTGP> {

	@Override
	public ACACTACTGP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACACTACTGP obj = new ACACTACTGP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACACTION_ID(rs.getBigDecimal("ACACTION_ID"));
		obj.setACACTGRP_ID(rs.getBigDecimal("ACACTGRP_ID"));
		
		return obj;
	}

}
