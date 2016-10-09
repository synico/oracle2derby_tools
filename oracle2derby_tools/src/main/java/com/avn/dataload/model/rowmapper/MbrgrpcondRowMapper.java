package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrgrpcond;

public class MbrgrpcondRowMapper<T> implements RowMapper<Mbrgrpcond> {

	@Override
	public Mbrgrpcond mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrgrpcond obj = new Mbrgrpcond();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setConditions(rs.getString("CONDITIONS"));
		obj.setField2(rs.getString("FIELD2"));
		
		return obj;
	}

}
