package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEFOVR;

public class SEOPAGEDEFOVRRowMapper<T> implements RowMapper<SEOPAGEDEFOVR> {

    private static final Logger log = Logger.getLogger(SEOPAGEDEFOVRRowMapper.class);

	@Override
	public SEOPAGEDEFOVR mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEFOVR obj = new SEOPAGEDEFOVR();
		
		obj.setOBJECT_ID(rs.getString("OBJECT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOBJECTTYPE(rs.getString("OBJECTTYPE"));
		obj.setSEOPAGEDEF_ID(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setSEOPAGEDEFOVR_ID(rs.getBigDecimal("SEOPAGEDEFOVR_ID"));
		obj.setAPPLY_TO_CHILD(rs.getBigDecimal("APPLY_TO_CHILD"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
