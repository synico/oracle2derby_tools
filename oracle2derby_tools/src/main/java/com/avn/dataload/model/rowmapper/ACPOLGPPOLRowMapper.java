package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLGPPOL;

public class ACPOLGPPOLRowMapper<T> implements RowMapper<ACPOLGPPOL> {

	@Override
	public ACPOLGPPOL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLGPPOL obj = new ACPOLGPPOL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACPOLGRP_ID(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setACPOLICY_ID(rs.getBigDecimal("ACPOLICY_ID"));
		
		return obj;
	}

}
