package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUYERPOTYP;

public class BUYERPOTYPRowMapper<T> implements RowMapper<BUYERPOTYP> {

    private static final Logger log = Logger.getLogger(BUYERPOTYPRowMapper.class);

	@Override
	public BUYERPOTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUYERPOTYP obj = new BUYERPOTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBUYERPOTYP_ID(rs.getBigDecimal("BUYERPOTYP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
