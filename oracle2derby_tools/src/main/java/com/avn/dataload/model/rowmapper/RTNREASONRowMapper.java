package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNREASON;

public class RTNREASONRowMapper<T> implements RowMapper<RTNREASON> {

    private static final Logger log = Logger.getLogger(RTNREASONRowMapper.class);

	@Override
	public RTNREASON mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNREASON obj = new RTNREASON();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setREASONTYPE(rs.getString("REASONTYPE"));
		obj.setRTNREASON_ID(rs.getBigDecimal("RTNREASON_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
