package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLSTRPLCY;

public class EMLSTRPLCYRowMapper<T> implements RowMapper<EMLSTRPLCY> {

    private static final Logger log = Logger.getLogger(EMLSTRPLCYRowMapper.class);

	@Override
	public EMLSTRPLCY mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLSTRPLCY obj = new EMLSTRPLCY();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEMLPOLICY_ID(rs.getBigDecimal("EMLPOLICY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
