package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHRLUS;

public class ATCHRLUSRowMapper<T> implements RowMapper<ATCHRLUS> {

    private static final Logger log = Logger.getLogger(ATCHRLUSRowMapper.class);

	@Override
	public ATCHRLUS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHRLUS obj = new ATCHRLUS();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setIMAGE(rs.getString("IMAGE"));
		obj.setATCHRLUS_ID(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
