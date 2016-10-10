package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLICY;

public class ACPOLICYRowMapper<T> implements RowMapper<ACPOLICY> {

	@Override
	public ACPOLICY mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLICY obj = new ACPOLICY();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setPOLICYNAME(rs.getString("POLICYNAME"));
		obj.setPOLICYTYPE(rs.getBigDecimal("POLICYTYPE"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setACACTGRP_ID(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setACPOLICY_ID(rs.getBigDecimal("ACPOLICY_ID"));
		obj.setACRELGRP_ID(rs.getBigDecimal("ACRELGRP_ID"));
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		
		return obj;
	}

}
