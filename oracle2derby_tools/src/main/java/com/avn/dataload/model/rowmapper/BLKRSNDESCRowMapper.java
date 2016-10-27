package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BLKRSNDESC;

public class BLKRSNDESCRowMapper<T> implements RowMapper<BLKRSNDESC> {

    private static final Logger log = Logger.getLogger(BLKRSNDESCRowMapper.class);

	@Override
	public BLKRSNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		BLKRSNDESC obj = new BLKRSNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
