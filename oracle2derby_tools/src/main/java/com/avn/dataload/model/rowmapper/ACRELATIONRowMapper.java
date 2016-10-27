package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRELATION;

public class ACRELATIONRowMapper<T> implements RowMapper<ACRELATION> {

    private static final Logger log = Logger.getLogger(ACRELATIONRowMapper.class);

	@Override
	public ACRELATION mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRELATION obj = new ACRELATION();
		
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		obj.setRELATIONNAME(rs.getString("RELATIONNAME"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
