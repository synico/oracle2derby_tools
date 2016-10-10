package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DISPCGPREL;

public class DISPCGPRELRowMapper<T> implements RowMapper<DISPCGPREL> {

	@Override
	public DISPCGPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		DISPCGPREL obj = new DISPCGPREL();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setPAGENAME(rs.getString("PAGENAME"));
		obj.setDISPCGPREL_ID(rs.getBigDecimal("DISPCGPREL_ID"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		
		return obj;
	}

}
