package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWTYPE;

public class FLOWTYPERowMapper<T> implements RowMapper<FLOWTYPE> {

    private static final Logger log = Logger.getLogger(FLOWTYPERowMapper.class);

	@Override
	public FLOWTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWTYPE obj = new FLOWTYPE();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setBIZFLOWBEANCLASS(rs.getString("BIZFLOWBEANCLASS"));
		obj.setATTRIBUTE(rs.getString("ATTRIBUTE"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
