package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTATEGP;

public class FLSTATEGPRowMapper<T> implements RowMapper<FLSTATEGP> {

    private static final Logger log = Logger.getLogger(FLSTATEGPRowMapper.class);

	@Override
	public FLSTATEGP mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTATEGP obj = new FLSTATEGP();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setFLSTATEGP_ID(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setMANDATORYSTATEGP(rs.getBigDecimal("MANDATORYSTATEGP"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
