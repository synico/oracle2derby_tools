package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYTYPDSC;

public class PLCYTYPDSCRowMapper<T> implements RowMapper<PLCYTYPDSC> {

	@Override
	public PLCYTYPDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYTYPDSC obj = new PLCYTYPDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		
		return obj;
	}

}
