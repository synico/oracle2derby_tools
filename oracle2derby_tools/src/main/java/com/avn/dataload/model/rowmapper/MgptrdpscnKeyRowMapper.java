package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MgptrdpscnKey;

public class MgptrdpscnKeyRowMapper<T> implements RowMapper<MgptrdpscnKey> {

	@Override
	public MgptrdpscnKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MgptrdpscnKey obj = new MgptrdpscnKey();
		
		obj.setTradeposcnId(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		
		return obj;
	}

}
