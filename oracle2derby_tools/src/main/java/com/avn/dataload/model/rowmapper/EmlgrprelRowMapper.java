package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlgrprel;

public class EmlgrprelRowMapper<T> implements RowMapper<Emlgrprel> {

	@Override
	public Emlgrprel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlgrprel obj = new Emlgrprel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setEmlpromoId(rs.getBigDecimal("EMLPROMO_ID"));
		
		return obj;
	}

}
