package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCOND;

public class CFCONDRowMapper<T> implements RowMapper<CFCOND> {

    private static final Logger log = Logger.getLogger(CFCONDRowMapper.class);

	@Override
	public CFCOND mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCOND obj = new CFCOND();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		obj.setCFCOND_ID(rs.getBigDecimal("CFCOND_ID"));
		obj.setOPERATOR(rs.getString("OPERATOR"));
		obj.setCFCONDGRP_ID(rs.getBigDecimal("CFCONDGRP_ID"));
		obj.setPROPERTYNAME(rs.getString("PROPERTYNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
