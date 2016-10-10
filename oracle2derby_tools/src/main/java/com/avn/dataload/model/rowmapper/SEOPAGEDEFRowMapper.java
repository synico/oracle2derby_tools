package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEF;

public class SEOPAGEDEFRowMapper<T> implements RowMapper<SEOPAGEDEF> {

	@Override
	public SEOPAGEDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEF obj = new SEOPAGEDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setPAGENAME(rs.getString("PAGENAME"));
		obj.setSEOPAGEDEF_ID(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setCREATEDTIME(rs.getTimestamp("CREATEDTIME"));
		
		return obj;
	}

}
