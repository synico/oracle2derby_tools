package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOW;

public class FLOWRowMapper<T> implements RowMapper<FLOW> {

    private static final Logger log = Logger.getLogger(FLOWRowMapper.class);

	@Override
	public FLOW mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOW obj = new FLOW();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setCOMPOSITEFLOW(rs.getBigDecimal("COMPOSITEFLOW"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		obj.setATTRIBUTE(rs.getString("ATTRIBUTE"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
