package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DISPCGPREL;

public class DISPCGPRELRowMapper<T> implements RowMapper<DISPCGPREL> {

    private static final Logger log = Logger.getLogger(DISPCGPRELRowMapper.class);

	@Override
	public DISPCGPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		DISPCGPREL obj = new DISPCGPREL();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		obj.setDISPCGPREL_ID(rs.getBigDecimal("DISPCGPREL_ID"));
		obj.setPAGENAME(rs.getString("PAGENAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
