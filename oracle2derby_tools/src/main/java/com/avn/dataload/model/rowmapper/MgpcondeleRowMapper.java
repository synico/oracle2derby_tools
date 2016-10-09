package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mgpcondele;

public class MgpcondeleRowMapper<T> implements RowMapper<Mgpcondele> {

	@Override
	public Mgpcondele mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mgpcondele obj = new Mgpcondele();
		
		obj.setName(rs.getString("NAME"));
		obj.setParent(rs.getString("PARENT"));
		obj.setValue(rs.getString("VALUE"));
		obj.setVariable(rs.getString("VARIABLE"));
		obj.setMgpcondeleId(rs.getBigDecimal("MGPCONDELE_ID"));
		obj.setOperator(rs.getString("OPERATOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setType(rs.getString("TYPE"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setCondname(rs.getString("CONDNAME"));
		obj.setNegate(rs.getBigDecimal("NEGATE"));
		
		return obj;
	}

}
