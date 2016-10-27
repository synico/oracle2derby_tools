package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XBOMUPLOAD;

public class XBOMUPLOADRowMapper<T> implements RowMapper<XBOMUPLOAD> {

    private static final Logger log = Logger.getLogger(XBOMUPLOADRowMapper.class);

	@Override
	public XBOMUPLOAD mapRow(ResultSet rs, int rowNum) throws SQLException {
		XBOMUPLOAD obj = new XBOMUPLOAD();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setXBOMUPLOADID(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setREQUISITIONLISTID(rs.getBigDecimal("REQUISITIONLISTID"));
		obj.setCREATEDDATE(rs.getTimestamp("CREATEDDATE"));
		obj.setUPLOADSTATUS(rs.getString("UPLOADSTATUS"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setROWCOUNTER(rs.getBigDecimal("ROWCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
