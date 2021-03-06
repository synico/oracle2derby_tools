package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYTYPDSC;

public class PLCYTYPDSCRowMapper<T> implements RowMapper<PLCYTYPDSC> {

    private static final Logger log = Logger.getLogger(PLCYTYPDSCRowMapper.class);

	@Override
	public PLCYTYPDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYTYPDSC obj = new PLCYTYPDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
