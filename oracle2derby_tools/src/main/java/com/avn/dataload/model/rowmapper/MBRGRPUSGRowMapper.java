package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPUSG;

public class MBRGRPUSGRowMapper<T> implements RowMapper<MBRGRPUSG> {

    private static final Logger log = Logger.getLogger(MBRGRPUSGRowMapper.class);

	@Override
	public MBRGRPUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPUSG obj = new MBRGRPUSG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setMBRGRPTYPE_ID(rs.getBigDecimal("MBRGRPTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
