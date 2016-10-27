package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLRPTEVTS;

public class EMLRPTEVTSRowMapper<T> implements RowMapper<EMLRPTEVTS> {

    private static final Logger log = Logger.getLogger(EMLRPTEVTSRowMapper.class);

	@Override
	public EMLRPTEVTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLRPTEVTS obj = new EMLRPTEVTS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setOPENED(rs.getTimestamp("OPENED"));
		obj.setCLICKED(rs.getTimestamp("CLICKED"));
		obj.setBOUNCED(rs.getTimestamp("BOUNCED"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
