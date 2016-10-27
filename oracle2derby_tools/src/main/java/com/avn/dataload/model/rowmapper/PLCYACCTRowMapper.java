package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYACCT;

public class PLCYACCTRowMapper<T> implements RowMapper<PLCYACCT> {

    private static final Logger log = Logger.getLogger(PLCYACCTRowMapper.class);

	@Override
	public PLCYACCT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYACCT obj = new PLCYACCT();
		
		obj.setPLCYACCT_ID(rs.getBigDecimal("PLCYACCT_ID"));
		obj.setPLCYACCLCK_ID(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setPLCYPASSWD_ID(rs.getBigDecimal("PLCYPASSWD_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
