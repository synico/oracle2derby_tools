package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDRELEASE;

public class ORDRELEASERowMapper<T> implements RowMapper<ORDRELEASE> {

    private static final Logger log = Logger.getLogger(ORDRELEASERowMapper.class);

	@Override
	public ORDRELEASE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDRELEASE obj = new ORDRELEASE();
		
		obj.setFFMACKNOWLEDGEMENT(rs.getTimestamp("FFMACKNOWLEDGEMENT"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCUSTOMERCONFIRM(rs.getTimestamp("CUSTOMERCONFIRM"));
		obj.setPICKBATCH_ID(rs.getBigDecimal("PICKBATCH_ID"));
		obj.setPACKSLIPXML(rs.getClob("PACKSLIPXML"));
		obj.setCAPTUREDATE(rs.getTimestamp("CAPTUREDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setISEXPEDITED(rs.getString("ISEXPEDITED"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setTIMEPLACED(rs.getTimestamp("TIMEPLACED"));
		obj.setEXTORDNUM(rs.getString("EXTORDNUM"));
		obj.setEXTREF(rs.getString("EXTREF"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
