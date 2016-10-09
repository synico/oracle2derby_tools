package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Preletemplate;

public class PreletemplateRowMapper<T> implements RowMapper<Preletemplate> {

	@Override
	public Preletemplate mapRow(ResultSet rs, int rowNum) throws SQLException {
		Preletemplate obj = new Preletemplate();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPreletemplateId(rs.getBigDecimal("PRELETEMPLATE_ID"));
		obj.setPreletpltgrpId(rs.getBigDecimal("PRELETPLTGRP_ID"));
		obj.setRuntimexml(rs.getString("RUNTIMEXML"));
		
		return obj;
	}

}
