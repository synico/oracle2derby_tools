package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COUNTRY;

public class COUNTRYRowMapper<T> implements RowMapper<COUNTRY> {

    private static final Logger log = Logger.getLogger(COUNTRYRowMapper.class);

	@Override
	public COUNTRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		COUNTRY obj = new COUNTRY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCOUNTRYABBR(rs.getString("COUNTRYABBR"));
		obj.setCALLINGCODE(rs.getString("CALLINGCODE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
