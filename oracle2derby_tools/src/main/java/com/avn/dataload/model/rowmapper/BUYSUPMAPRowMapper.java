package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUYSUPMAP;

public class BUYSUPMAPRowMapper<T> implements RowMapper<BUYSUPMAP> {

	@Override
	public BUYSUPMAP mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUYSUPMAP obj = new BUYSUPMAP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSUPORG_ID(rs.getBigDecimal("SUPORG_ID"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setBUYORGUNIT_ID(rs.getBigDecimal("BUYORGUNIT_ID"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		
		return obj;
	}

}
