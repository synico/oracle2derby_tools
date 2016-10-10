package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDRELEASE;

public class ORDRELEASERowMapper<T> implements RowMapper<ORDRELEASE> {

	@Override
	public ORDRELEASE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDRELEASE obj = new ORDRELEASE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setTIMEPLACED(rs.getTimestamp("TIMEPLACED"));
		obj.setEXTORDNUM(rs.getString("EXTORDNUM"));
		obj.setEXTREF(rs.getString("EXTREF"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setFFMACKNOWLEDGEMENT(rs.getTimestamp("FFMACKNOWLEDGEMENT"));
		obj.setCUSTOMERCONFIRM(rs.getTimestamp("CUSTOMERCONFIRM"));
		obj.setPICKBATCH_ID(rs.getBigDecimal("PICKBATCH_ID"));
		obj.setPACKSLIPXML(rs.getClob("PACKSLIPXML"));
		obj.setCAPTUREDATE(rs.getTimestamp("CAPTUREDATE"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setISEXPEDITED(rs.getString("ISEXPEDITED"));
		
		return obj;
	}

}
