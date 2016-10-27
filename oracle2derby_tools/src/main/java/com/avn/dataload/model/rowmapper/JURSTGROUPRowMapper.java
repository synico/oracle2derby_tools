package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.JURSTGROUP;

public class JURSTGROUPRowMapper<T> implements RowMapper<JURSTGROUP> {

    private static final Logger log = Logger.getLogger(JURSTGROUPRowMapper.class);

	@Override
	public JURSTGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		JURSTGROUP obj = new JURSTGROUP();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setJURSTGROUP_ID(rs.getBigDecimal("JURSTGROUP_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCODE(rs.getString("CODE"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
