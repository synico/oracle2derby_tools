package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMMETADATA;

public class CMMETADATARowMapper<T> implements RowMapper<CMMETADATA> {

	@Override
	public CMMETADATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMMETADATA obj = new CMMETADATA();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setACTION(rs.getString("ACTION"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setTASKGRP(rs.getString("TASKGRP"));
		obj.setTASK(rs.getString("TASK"));
		obj.setBOKEY1(rs.getBigDecimal("BOKEY1"));
		obj.setBOKEY2(rs.getBigDecimal("BOKEY2"));
		obj.setBOKEY3(rs.getBigDecimal("BOKEY3"));
		obj.setBOKEY4(rs.getBigDecimal("BOKEY4"));
		obj.setCMCONTAINER_ID(rs.getBigDecimal("CMCONTAINER_ID"));
		obj.setCMRESMGR_ID(rs.getBigDecimal("CMRESMGR_ID"));
		obj.setCMTIMESTAMP(rs.getTimestamp("CMTIMESTAMP"));
		
		return obj;
	}

}
