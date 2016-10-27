package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTACHUSG;

public class ATTACHUSGRowMapper<T> implements RowMapper<ATTACHUSG> {

    private static final Logger log = Logger.getLogger(ATTACHUSGRowMapper.class);

	@Override
	public ATTACHUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTACHUSG obj = new ATTACHUSG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTACHUSG_ID(rs.getString("ATTACHUSG_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
