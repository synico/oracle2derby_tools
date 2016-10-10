package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XBOMUPLOAD;

public class XBOMUPLOADRowMapper<T> implements RowMapper<XBOMUPLOAD> {

	@Override
	public XBOMUPLOAD mapRow(ResultSet rs, int rowNum) throws SQLException {
		XBOMUPLOAD obj = new XBOMUPLOAD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setXBOMUPLOADID(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setREQUISITIONLISTID(rs.getBigDecimal("REQUISITIONLISTID"));
		obj.setCREATEDDATE(rs.getTimestamp("CREATEDDATE"));
		obj.setUPLOADSTATUS(rs.getString("UPLOADSTATUS"));
		obj.setROWCOUNTER(rs.getBigDecimal("ROWCOUNTER"));
		
		return obj;
	}

}
