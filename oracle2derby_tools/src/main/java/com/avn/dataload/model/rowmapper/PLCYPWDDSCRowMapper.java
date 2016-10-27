package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYPWDDSC;

public class PLCYPWDDSCRowMapper<T> implements RowMapper<PLCYPWDDSC> {

    private static final Logger log = Logger.getLogger(PLCYPWDDSCRowMapper.class);

	@Override
	public PLCYPWDDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYPWDDSC obj = new PLCYPWDDSC();
		
		obj.setPLCYPASSWD_ID(rs.getBigDecimal("PLCYPASSWD_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
