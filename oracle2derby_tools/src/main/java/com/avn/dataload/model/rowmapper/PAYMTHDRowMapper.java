package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYMTHD;

public class PAYMTHDRowMapper<T> implements RowMapper<PAYMTHD> {

    private static final Logger log = Logger.getLogger(PAYMTHDRowMapper.class);

	@Override
	public PAYMTHD mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYMTHD obj = new PAYMTHD();
		
		obj.setPROFILENAME(rs.getString("PROFILENAME"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAYMTHD_ID(rs.getBigDecimal("PAYMTHD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
