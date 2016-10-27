package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNRSNDESC;

public class RTNRSNDESCRowMapper<T> implements RowMapper<RTNRSNDESC> {

    private static final Logger log = Logger.getLogger(RTNRSNDESCRowMapper.class);

	@Override
	public RTNRSNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNRSNDESC obj = new RTNRSNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setRTNREASON_ID(rs.getBigDecimal("RTNREASON_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
