package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECGRP;

public class STORECGRPRowMapper<T> implements RowMapper<STORECGRP> {

	@Override
	public STORECGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECGRP obj = new STORECGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		return obj;
	}

}
