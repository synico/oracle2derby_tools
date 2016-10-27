package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLTYPEDESC;

public class FLTYPEDESCRowMapper<T> implements RowMapper<FLTYPEDESC> {

    private static final Logger log = Logger.getLogger(FLTYPEDESCRowMapper.class);

	@Override
	public FLTYPEDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLTYPEDESC obj = new FLTYPEDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
