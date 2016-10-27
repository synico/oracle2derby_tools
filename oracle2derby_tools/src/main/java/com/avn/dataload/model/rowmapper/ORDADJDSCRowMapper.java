package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDADJDSC;

public class ORDADJDSCRowMapper<T> implements RowMapper<ORDADJDSC> {

    private static final Logger log = Logger.getLogger(ORDADJDSCRowMapper.class);

	@Override
	public ORDADJDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDADJDSC obj = new ORDADJDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
