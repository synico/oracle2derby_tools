package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYACCLCK;

public class PLCYACCLCKRowMapper<T> implements RowMapper<PLCYACCLCK> {

	@Override
	public PLCYACCLCK mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYACCLCK obj = new PLCYACCLCK();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPLCYACCLCK_ID(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setLOCKOUTTHRESHOLD(rs.getBigDecimal("LOCKOUTTHRESHOLD"));
		obj.setWAITTIME(rs.getBigDecimal("WAITTIME"));
		
		return obj;
	}

}
