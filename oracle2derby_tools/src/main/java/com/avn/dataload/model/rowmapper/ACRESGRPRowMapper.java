package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESGRP;

public class ACRESGRPRowMapper<T> implements RowMapper<ACRESGRP> {

    private static final Logger log = Logger.getLogger(ACRESGRPRowMapper.class);

	@Override
	public ACRESGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESGRP obj = new ACRESGRP();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setACRESGRP_ID(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setGRPNAME(rs.getString("GRPNAME"));
		obj.setCONDITIONS(rs.getString("CONDITIONS"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
