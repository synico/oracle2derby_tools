package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STLOC;

public class STLOCRowMapper<T> implements RowMapper<STLOC> {

	@Override
	public STLOC mapRow(ResultSet rs, int rowNum) throws SQLException {
		STLOC obj = new STLOC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setADDRESS1(rs.getString("ADDRESS1"));
		obj.setADDRESS2(rs.getString("ADDRESS2"));
		obj.setADDRESS3(rs.getString("ADDRESS3"));
		obj.setCITY(rs.getString("CITY"));
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setZIPCODE(rs.getString("ZIPCODE"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setSTLOC_ID(rs.getBigDecimal("STLOC_ID"));
		obj.setPHONE(rs.getString("PHONE"));
		obj.setFAX(rs.getString("FAX"));
		obj.setACTIVE(rs.getBigDecimal("ACTIVE"));
		obj.setLATITUDE(rs.getBigDecimal("LATITUDE"));
		obj.setLONGITUDE(rs.getBigDecimal("LONGITUDE"));
		obj.setGEONODE_ID(rs.getBigDecimal("GEONODE_ID"));
		
		return obj;
	}

}
