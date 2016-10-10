package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHCONFEXT;

public class SRCHCONFEXTRowMapper<T> implements RowMapper<SRCHCONFEXT> {

	@Override
	public SRCHCONFEXT mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHCONFEXT obj = new SRCHCONFEXT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSRCHCONFEXT_ID(rs.getBigDecimal("SRCHCONFEXT_ID"));
		obj.setINDEXSUBTYPE(rs.getString("INDEXSUBTYPE"));
		obj.setINDEXSCOPE(rs.getString("INDEXSCOPE"));
		obj.setINDEXTYPE(rs.getString("INDEXTYPE"));
		obj.setCONFIG(rs.getString("CONFIG"));
		
		return obj;
	}

}
