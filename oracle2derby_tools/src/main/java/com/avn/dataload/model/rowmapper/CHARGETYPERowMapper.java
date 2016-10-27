package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHARGETYPE;

public class CHARGETYPERowMapper<T> implements RowMapper<CHARGETYPE> {

    private static final Logger log = Logger.getLogger(CHARGETYPERowMapper.class);

	@Override
	public CHARGETYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHARGETYPE obj = new CHARGETYPE();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setCHARGETYPE_ID(rs.getBigDecimal("CHARGETYPE_ID"));
		obj.setDISPLAYAGGREGATED(rs.getString("DISPLAYAGGREGATED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
