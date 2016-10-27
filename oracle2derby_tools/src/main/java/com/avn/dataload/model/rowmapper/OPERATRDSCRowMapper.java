package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OPERATRDSC;

public class OPERATRDSCRowMapper<T> implements RowMapper<OPERATRDSC> {

    private static final Logger log = Logger.getLogger(OPERATRDSCRowMapper.class);

	@Override
	public OPERATRDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		OPERATRDSC obj = new OPERATRDSC();
		
		obj.setOPERATOR_ID(rs.getBigDecimal("OPERATOR_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
