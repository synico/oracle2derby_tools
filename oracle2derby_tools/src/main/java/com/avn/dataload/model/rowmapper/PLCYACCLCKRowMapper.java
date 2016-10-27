package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYACCLCK;

public class PLCYACCLCKRowMapper<T> implements RowMapper<PLCYACCLCK> {

    private static final Logger log = Logger.getLogger(PLCYACCLCKRowMapper.class);

	@Override
	public PLCYACCLCK mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYACCLCK obj = new PLCYACCLCK();
		
		obj.setPLCYACCLCK_ID(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setLOCKOUTTHRESHOLD(rs.getBigDecimal("LOCKOUTTHRESHOLD"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setWAITTIME(rs.getBigDecimal("WAITTIME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
