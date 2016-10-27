package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOREDIRECT;

public class SEOREDIRECTRowMapper<T> implements RowMapper<SEOREDIRECT> {

    private static final Logger log = Logger.getLogger(SEOREDIRECTRowMapper.class);

	@Override
	public SEOREDIRECT mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOREDIRECT obj = new SEOREDIRECT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEOREDIRECT_ID(rs.getBigDecimal("SEOREDIRECT_ID"));
		obj.setSEOURLKWD_ID_NEW(rs.getBigDecimal("SEOURLKWD_ID_NEW"));
		obj.setSEOURLKWD_ID_ORIG(rs.getBigDecimal("SEOURLKWD_ID_ORIG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
