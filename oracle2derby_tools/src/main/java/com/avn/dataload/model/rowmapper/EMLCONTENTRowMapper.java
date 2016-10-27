package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLCONTENT;

public class EMLCONTENTRowMapper<T> implements RowMapper<EMLCONTENT> {

    private static final Logger log = Logger.getLogger(EMLCONTENTRowMapper.class);

	@Override
	public EMLCONTENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLCONTENT obj = new EMLCONTENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLASTMODIFY(rs.getTimestamp("LASTMODIFY"));
		obj.setRECORDOPEN(rs.getBigDecimal("RECORDOPEN"));
		obj.setEMLSUBJECT(rs.getString("EMLSUBJECT"));
		obj.setEMLBODY(rs.getClob("EMLBODY"));
		obj.setEMLCONTENT_ID(rs.getBigDecimal("EMLCONTENT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
