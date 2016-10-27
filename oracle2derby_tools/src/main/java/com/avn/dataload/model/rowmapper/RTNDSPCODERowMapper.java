package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDSPCODE;

public class RTNDSPCODERowMapper<T> implements RowMapper<RTNDSPCODE> {

    private static final Logger log = Logger.getLogger(RTNDSPCODERowMapper.class);

	@Override
	public RTNDSPCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDSPCODE obj = new RTNDSPCODE();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setRTNDSPCODE_ID(rs.getBigDecimal("RTNDSPCODE_ID"));
		obj.setRETURNTOINVENTORY(rs.getString("RETURNTOINVENTORY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
