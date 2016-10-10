package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYACCT;

public class PLCYACCTRowMapper<T> implements RowMapper<PLCYACCT> {

	@Override
	public PLCYACCT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYACCT obj = new PLCYACCT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPLCYACCT_ID(rs.getBigDecimal("PLCYACCT_ID"));
		obj.setPLCYACCLCK_ID(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setPLCYPASSWD_ID(rs.getBigDecimal("PLCYPASSWD_ID"));
		
		return obj;
	}

}
