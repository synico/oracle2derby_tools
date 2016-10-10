package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOPAGEDEFDESC;

public class SEOPAGEDEFDESCRowMapper<T> implements RowMapper<SEOPAGEDEFDESC> {

	@Override
	public SEOPAGEDEFDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOPAGEDEFDESC obj = new SEOPAGEDEFDESC();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setTITLE(rs.getString("TITLE"));
		obj.setSEOPAGEDEF_ID(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setCREATEDTIME(rs.getTimestamp("CREATEDTIME"));
		obj.setMETA_KEYWORD(rs.getString("META_KEYWORD"));
		obj.setIMAGE_ALT_DESC(rs.getString("IMAGE_ALT_DESC"));
		obj.setMETA_DESC(rs.getString("META_DESC"));
		
		return obj;
	}

}
