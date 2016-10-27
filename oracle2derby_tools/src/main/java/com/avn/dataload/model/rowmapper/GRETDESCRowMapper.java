package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.GRETDESC;

public class GRETDESCRowMapper<T> implements RowMapper<GRETDESC> {

    private static final Logger log = Logger.getLogger(GRETDESCRowMapper.class);

	@Override
	public GRETDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		GRETDESC obj = new GRETDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEVENTTYPE_ID(rs.getBigDecimal("EVENTTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
