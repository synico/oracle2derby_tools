package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLPOLICY;

public class EMLPOLICYRowMapper<T> implements RowMapper<EMLPOLICY> {

    private static final Logger log = Logger.getLogger(EMLPOLICYRowMapper.class);

	@Override
	public EMLPOLICY mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLPOLICY obj = new EMLPOLICY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNUMRETRIES(rs.getBigDecimal("NUMRETRIES"));
		obj.setINTERVAL(rs.getBigDecimal("INTERVAL"));
		obj.setEMLPOLICY_ID(rs.getBigDecimal("EMLPOLICY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
