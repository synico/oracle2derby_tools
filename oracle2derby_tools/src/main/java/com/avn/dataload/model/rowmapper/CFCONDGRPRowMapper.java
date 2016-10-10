package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCONDGRP;

public class CFCONDGRPRowMapper<T> implements RowMapper<CFCONDGRP> {

	@Override
	public CFCONDGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCONDGRP obj = new CFCONDGRP();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setCFCATGROUP_ID(rs.getBigDecimal("CFCATGROUP_ID"));
		obj.setCFCONDGRP_ID(rs.getBigDecimal("CFCONDGRP_ID"));
		obj.setCONDITIONRELATION(rs.getBigDecimal("CONDITIONRELATION"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		
		return obj;
	}

}
