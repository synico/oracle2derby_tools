package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XBOMUPLOADDATA;

public class XBOMUPLOADDATARowMapper<T> implements RowMapper<XBOMUPLOADDATA> {

    private static final Logger log = Logger.getLogger(XBOMUPLOADDATARowMapper.class);

	@Override
	public XBOMUPLOADDATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		XBOMUPLOADDATA obj = new XBOMUPLOADDATA();
		
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setXBOMUPLOADID(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setCREATEDDATE(rs.getTimestamp("CREATEDDATE"));
		obj.setXBOMUPLOADDATAID(rs.getBigDecimal("XBOMUPLOADDATAID"));
		obj.setCUSTOMERPARTNUMBER(rs.getString("CUSTOMERPARTNUMBER"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setMFNAME(rs.getString("MFNAME"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		obj.setROWCOUNTER(rs.getBigDecimal("ROWCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
