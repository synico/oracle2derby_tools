package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECATOVRGRP;

public class STORECATOVRGRPRowMapper<T> implements RowMapper<STORECATOVRGRP> {

	@Override
	public STORECATOVRGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECATOVRGRP obj = new STORECATOVRGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATOVRGRP_ID(rs.getBigDecimal("CATOVRGRP_ID"));
		
		return obj;
	}

}
