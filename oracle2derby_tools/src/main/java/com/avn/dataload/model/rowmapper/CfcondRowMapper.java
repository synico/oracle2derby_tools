package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cfcond;

public class CfcondRowMapper<T> implements RowMapper<Cfcond> {

	@Override
	public Cfcond mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cfcond obj = new Cfcond();
		
		obj.setField4(rs.getBigDecimal("FIELD4"));
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setCfcondgrpId(rs.getBigDecimal("CFCONDGRP_ID"));
		obj.setPropertyname(rs.getString("PROPERTYNAME"));
		obj.setField5(rs.getBigDecimal("FIELD5"));
		obj.setCfcondId(rs.getBigDecimal("CFCOND_ID"));
		obj.setOperator(rs.getString("OPERATOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setField3(rs.getString("FIELD3"));
		
		return obj;
	}

}
