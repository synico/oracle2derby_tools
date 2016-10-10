package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLGRP;

public class ACPOLGRPRowMapper<T> implements RowMapper<ACPOLGRP> {

	@Override
	public ACPOLGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLGRP obj = new ACPOLGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		
		return obj;
	}

}
