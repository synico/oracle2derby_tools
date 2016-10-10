package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BLKRSNDESC;

public class BLKRSNDESCRowMapper<T> implements RowMapper<BLKRSNDESC> {

	@Override
	public BLKRSNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		BLKRSNDESC obj = new BLKRSNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
