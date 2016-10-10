package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYLCKDSC;

public class PLCYLCKDSCRowMapper<T> implements RowMapper<PLCYLCKDSC> {

	@Override
	public PLCYLCKDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYLCKDSC obj = new PLCYLCKDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPLCYACCLCK_ID(rs.getBigDecimal("PLCYACCLCK_ID"));
		
		return obj;
	}

}
