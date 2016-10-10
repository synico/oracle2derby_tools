package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATOVRGRP;

public class CATOVRGRPRowMapper<T> implements RowMapper<CATOVRGRP> {

	@Override
	public CATOVRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATOVRGRP obj = new CATOVRGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATOVRGRP_ID(rs.getBigDecimal("CATOVRGRP_ID"));
		
		return obj;
	}

}
