package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CACHEIVL;

public class CACHEIVLRowMapper<T> implements RowMapper<CACHEIVL> {

    private static final Logger log = Logger.getLogger(CACHEIVLRowMapper.class);

	@Override
	public CACHEIVL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CACHEIVL obj = new CACHEIVL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTEMPLATE(rs.getString("TEMPLATE"));
		obj.setDATAID(rs.getString("DATAID"));
		obj.setINSERTTIME(rs.getTimestamp("INSERTTIME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
