package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DISPENTREL;

public class DISPENTRELRowMapper<T> implements RowMapper<DISPENTREL> {

	@Override
	public DISPENTREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		DISPENTREL obj = new DISPENTREL();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setCATENTTYPE_ID(rs.getString("CATENTTYPE_ID"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setPAGENAME(rs.getString("PAGENAME"));
		obj.setDISPENTREL_ID(rs.getBigDecimal("DISPENTREL_ID"));
		obj.setAUCTIONSTATE(rs.getBigDecimal("AUCTIONSTATE"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		
		return obj;
	}

}