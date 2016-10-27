package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELEMENTATTR;

public class PRELEMENTATTRRowMapper<T> implements RowMapper<PRELEMENTATTR> {

    private static final Logger log = Logger.getLogger(PRELEMENTATTRRowMapper.class);

	@Override
	public PRELEMENTATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELEMENTATTR obj = new PRELEMENTATTR();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPRELEMENT_ID(rs.getBigDecimal("PRELEMENT_ID"));
		obj.setVALUE(rs.getString("VALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
