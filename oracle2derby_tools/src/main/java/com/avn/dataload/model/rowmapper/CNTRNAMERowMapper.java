package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CNTRNAME;

public class CNTRNAMERowMapper<T> implements RowMapper<CNTRNAME> {

    private static final Logger log = Logger.getLogger(CNTRNAMERowMapper.class);

	@Override
	public CNTRNAME mapRow(ResultSet rs, int rowNum) throws SQLException {
		CNTRNAME obj = new CNTRNAME();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setORIGIN(rs.getBigDecimal("ORIGIN"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
