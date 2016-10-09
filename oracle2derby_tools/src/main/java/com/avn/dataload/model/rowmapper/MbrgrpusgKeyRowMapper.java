package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MbrgrpusgKey;

public class MbrgrpusgKeyRowMapper<T> implements RowMapper<MbrgrpusgKey> {

	@Override
	public MbrgrpusgKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MbrgrpusgKey obj = new MbrgrpusgKey();
		
		obj.setMbrgrptypeId(rs.getBigDecimal("MBRGRPTYPE_ID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
