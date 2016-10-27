package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVADJCODE;

public class INVADJCODERowMapper<T> implements RowMapper<INVADJCODE> {

    private static final Logger log = Logger.getLogger(INVADJCODERowMapper.class);

	@Override
	public INVADJCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVADJCODE obj = new INVADJCODE();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINVADJCODE_ID(rs.getBigDecimal("INVADJCODE_ID"));
		obj.setADJUSTCODE(rs.getString("ADJUSTCODE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
