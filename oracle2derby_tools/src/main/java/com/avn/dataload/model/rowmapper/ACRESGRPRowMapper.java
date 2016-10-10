package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGRP;

public class ACRESGRPRowMapper<T> implements RowMapper<ACRESGRP> {

	@Override
	public ACRESGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGRP obj = new ACRESGRP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setGRPNAME(rs.getString("GRPNAME"));
		obj.setCONDITIONS(rs.getString("CONDITIONS"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		
		return obj;
	}

}
