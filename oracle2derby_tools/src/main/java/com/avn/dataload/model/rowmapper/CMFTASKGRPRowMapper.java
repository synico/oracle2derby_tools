package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTASKGRP;

public class CMFTASKGRPRowMapper<T> implements RowMapper<CMFTASKGRP> {

	@Override
	public CMFTASKGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTASKGRP obj = new CMFTASKGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDUEDATE(rs.getTimestamp("DUEDATE"));
		obj.setCOMMITDATE(rs.getTimestamp("COMMITDATE"));
		obj.setTEMPLATETYPE(rs.getBigDecimal("TEMPLATETYPE"));
		obj.setCMFTASKGRP_ID(rs.getBigDecimal("CMFTASKGRP_ID"));
		obj.setAPPROVEDATE(rs.getTimestamp("APPROVEDATE"));
		obj.setPROMOTIONDATE(rs.getTimestamp("PROMOTIONDATE"));
		obj.setPERSISTENTYPE(rs.getBigDecimal("PERSISTENTYPE"));
		obj.setQUICKPUBLISHTYPE(rs.getBigDecimal("QUICKPUBLISHTYPE"));
		
		return obj;
	}

}
