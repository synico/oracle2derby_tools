package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cfcondgrp;

public class CfcondgrpRowMapper<T> implements RowMapper<Cfcondgrp> {

	@Override
	public Cfcondgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cfcondgrp obj = new Cfcondgrp();
		
		obj.setField4(rs.getBigDecimal("FIELD4"));
		obj.setCfcatgroupId(rs.getBigDecimal("CFCATGROUP_ID"));
		obj.setCfcondgrpId(rs.getBigDecimal("CFCONDGRP_ID"));
		obj.setConditionrelation(rs.getBigDecimal("CONDITIONRELATION"));
		obj.setField5(rs.getBigDecimal("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		
		return obj;
	}

}
