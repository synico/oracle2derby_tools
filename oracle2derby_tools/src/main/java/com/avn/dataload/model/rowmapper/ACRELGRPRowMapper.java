package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRELGRP;

public class ACRELGRPRowMapper<T> implements RowMapper<ACRELGRP> {

	@Override
	public ACRELGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRELGRP obj = new ACRELGRP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setGRPNAME(rs.getString("GRPNAME"));
		obj.setCONDITIONS(rs.getString("CONDITIONS"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setACRELGRP_ID(rs.getBigDecimal("ACRELGRP_ID"));
		
		return obj;
	}

}
