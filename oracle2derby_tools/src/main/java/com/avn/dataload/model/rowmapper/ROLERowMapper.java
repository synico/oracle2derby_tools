package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ROLE;

public class ROLERowMapper<T> implements RowMapper<ROLE> {

    private static final Logger log = Logger.getLogger(ROLERowMapper.class);

	@Override
	public ROLE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ROLE obj = new ROLE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
