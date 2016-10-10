package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEFSUBPARAM;

public class SEOPAGEDEFSUBPARAMRowMapper<T> implements RowMapper<SEOPAGEDEFSUBPARAM> {

	@Override
	public SEOPAGEDEFSUBPARAM mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEFSUBPARAM obj = new SEOPAGEDEFSUBPARAM();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setADMINDESC(rs.getString("ADMINDESC"));
		obj.setSUBPARAMNAME(rs.getString("SUBPARAMNAME"));
		
		return obj;
	}

}
