package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVADJDESC;

public class INVADJDESCRowMapper<T> implements RowMapper<INVADJDESC> {

    private static final Logger log = Logger.getLogger(INVADJDESCRowMapper.class);

	@Override
	public INVADJDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVADJDESC obj = new INVADJDESC();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINVADJCODE_ID(rs.getBigDecimal("INVADJCODE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
