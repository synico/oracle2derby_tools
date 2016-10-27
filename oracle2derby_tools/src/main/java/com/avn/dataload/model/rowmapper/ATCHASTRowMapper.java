package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHAST;

public class ATCHASTRowMapper<T> implements RowMapper<ATCHAST> {

    private static final Logger log = Logger.getLogger(ATCHASTRowMapper.class);

	@Override
	public ATCHAST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHAST obj = new ATCHAST();
		
		obj.setATCHAST_ID(rs.getBigDecimal("ATCHAST_ID"));
		obj.setATCHTGT_ID(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setMIMETYPE(rs.getString("MIMETYPE"));
		obj.setIMAGE1(rs.getString("IMAGE1"));
		obj.setIMAGE2(rs.getString("IMAGE2"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setATCHASTPATH(rs.getString("ATCHASTPATH"));
		obj.setDIRECTORYPATH(rs.getString("DIRECTORYPATH"));
		obj.setMIMETYPEENCODING(rs.getString("MIMETYPEENCODING"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
