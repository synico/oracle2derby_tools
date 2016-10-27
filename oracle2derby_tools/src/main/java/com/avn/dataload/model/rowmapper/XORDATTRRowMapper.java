package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XORDATTR;

public class XORDATTRRowMapper<T> implements RowMapper<XORDATTR> {

    private static final Logger log = Logger.getLogger(XORDATTRRowMapper.class);

	@Override
	public XORDATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		XORDATTR obj = new XORDATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setORDATTR_ID(rs.getBigDecimal("ORDATTR_ID"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
