package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XBOMUPLOADDATA;

public class XBOMUPLOADDATARowMapper<T> implements RowMapper<XBOMUPLOADDATA> {

	@Override
	public XBOMUPLOADDATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		XBOMUPLOADDATA obj = new XBOMUPLOADDATA();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setMFNAME(rs.getString("MFNAME"));
		obj.setXBOMUPLOADID(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setCREATEDDATE(rs.getTimestamp("CREATEDDATE"));
		obj.setXBOMUPLOADDATAID(rs.getBigDecimal("XBOMUPLOADDATAID"));
		obj.setCUSTOMERPARTNUMBER(rs.getString("CUSTOMERPARTNUMBER"));
		obj.setROWCOUNTER(rs.getBigDecimal("ROWCOUNTER"));
		
		return obj;
	}

}
