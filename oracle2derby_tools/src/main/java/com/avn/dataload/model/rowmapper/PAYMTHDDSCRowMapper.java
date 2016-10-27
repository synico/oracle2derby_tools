package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYMTHDDSC;

public class PAYMTHDDSCRowMapper<T> implements RowMapper<PAYMTHDDSC> {

    private static final Logger log = Logger.getLogger(PAYMTHDDSCRowMapper.class);

	@Override
	public PAYMTHDDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYMTHDDSC obj = new PAYMTHDDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPAYMTHD_ID(rs.getBigDecimal("PAYMTHD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
