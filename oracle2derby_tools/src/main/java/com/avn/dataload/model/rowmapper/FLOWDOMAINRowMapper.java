package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWDOMAIN;

public class FLOWDOMAINRowMapper<T> implements RowMapper<FLOWDOMAIN> {

    private static final Logger log = Logger.getLogger(FLOWDOMAINRowMapper.class);

	@Override
	public FLOWDOMAIN mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWDOMAIN obj = new FLOWDOMAIN();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
