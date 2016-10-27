package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEFSUBPARAM;

public class SEOPAGEDEFSUBPARAMRowMapper<T> implements RowMapper<SEOPAGEDEFSUBPARAM> {

    private static final Logger log = Logger.getLogger(SEOPAGEDEFSUBPARAMRowMapper.class);

	@Override
	public SEOPAGEDEFSUBPARAM mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEFSUBPARAM obj = new SEOPAGEDEFSUBPARAM();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setADMINDESC(rs.getString("ADMINDESC"));
		obj.setSUBPARAMNAME(rs.getString("SUBPARAMNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
