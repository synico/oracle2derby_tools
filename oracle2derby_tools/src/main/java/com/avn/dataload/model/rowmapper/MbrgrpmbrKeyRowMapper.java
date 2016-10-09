package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MbrgrpmbrKey;

public class MbrgrpmbrKeyRowMapper<T> implements RowMapper<MbrgrpmbrKey> {

	@Override
	public MbrgrpmbrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MbrgrpmbrKey obj = new MbrgrpmbrKey();
		
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
