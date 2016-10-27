package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LANGUAGEDS;

public class LANGUAGEDSRowMapper<T> implements RowMapper<LANGUAGEDS> {

    private static final Logger log = Logger.getLogger(LANGUAGEDSRowMapper.class);

	@Override
	public LANGUAGEDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		LANGUAGEDS obj = new LANGUAGEDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID_DESC(rs.getBigDecimal("LANGUAGE_ID_DESC"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
