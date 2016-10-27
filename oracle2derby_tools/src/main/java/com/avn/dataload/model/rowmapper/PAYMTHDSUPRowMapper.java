package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYMTHDSUP;

public class PAYMTHDSUPRowMapper<T> implements RowMapper<PAYMTHDSUP> {

    private static final Logger log = Logger.getLogger(PAYMTHDSUPRowMapper.class);

	@Override
	public PAYMTHDSUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYMTHDSUP obj = new PAYMTHDSUP();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setPAYMTHD_ID(rs.getBigDecimal("PAYMTHD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
