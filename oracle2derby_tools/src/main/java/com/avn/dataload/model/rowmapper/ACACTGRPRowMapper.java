package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACACTGRP;

public class ACACTGRPRowMapper<T> implements RowMapper<ACACTGRP> {

    private static final Logger log = Logger.getLogger(ACACTGRPRowMapper.class);

	@Override
	public ACACTGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACACTGRP obj = new ACACTGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setGROUPNAME(rs.getString("GROUPNAME"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setACACTGRP_ID(rs.getBigDecimal("ACACTGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
