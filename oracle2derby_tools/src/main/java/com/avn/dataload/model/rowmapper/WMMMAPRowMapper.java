package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.WMMMAP;

public class WMMMAPRowMapper<T> implements RowMapper<WMMMAP> {

    private static final Logger log = Logger.getLogger(WMMMAPRowMapper.class);

	@Override
	public WMMMAP mapRow(ResultSet rs, int rowNum) throws SQLException {
		WMMMAP obj = new WMMMAP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setLASTSYNC(rs.getTimestamp("LASTSYNC"));
		obj.setMEMBER_UNIQUE_ID(rs.getString("MEMBER_UNIQUE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
