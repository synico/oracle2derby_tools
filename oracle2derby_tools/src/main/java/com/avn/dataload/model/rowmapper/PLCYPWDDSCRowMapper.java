package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYPWDDSC;

public class PLCYPWDDSCRowMapper<T> implements RowMapper<PLCYPWDDSC> {

	@Override
	public PLCYPWDDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYPWDDSC obj = new PLCYPWDDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPLCYPASSWD_ID(rs.getBigDecimal("PLCYPASSWD_ID"));
		
		return obj;
	}

}
