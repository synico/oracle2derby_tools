package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYACCDSC;

public class PLCYACCDSCRowMapper<T> implements RowMapper<PLCYACCDSC> {

	@Override
	public PLCYACCDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYACCDSC obj = new PLCYACCDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPLCYACCT_ID(rs.getBigDecimal("PLCYACCT_ID"));
		
		return obj;
	}

}
