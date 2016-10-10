package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELETEMPLATE;

public class PRELETEMPLATERowMapper<T> implements RowMapper<PRELETEMPLATE> {

	@Override
	public PRELETEMPLATE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELETEMPLATE obj = new PRELETEMPLATE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPRELETEMPLATE_ID(rs.getBigDecimal("PRELETEMPLATE_ID"));
		obj.setPRELETPLTGRP_ID(rs.getBigDecimal("PRELETPLTGRP_ID"));
		obj.setRUNTIMEXML(rs.getClob("RUNTIMEXML"));
		
		return obj;
	}

}
