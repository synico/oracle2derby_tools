package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LANGPAIR;

public class LANGPAIRRowMapper<T> implements RowMapper<LANGPAIR> {

    private static final Logger log = Logger.getLogger(LANGPAIRRowMapper.class);

	@Override
	public LANGPAIR mapRow(ResultSet rs, int rowNum) throws SQLException {
		LANGPAIR obj = new LANGPAIR();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID_ALT(rs.getBigDecimal("LANGUAGE_ID_ALT"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
