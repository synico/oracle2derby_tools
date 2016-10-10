package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MANIFEST;

public class MANIFESTRowMapper<T> implements RowMapper<MANIFEST> {

	@Override
	public MANIFEST mapRow(ResultSet rs, int rowNum) throws SQLException {
		MANIFEST obj = new MANIFEST();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setWEIGHTMEASURE(rs.getString("WEIGHTMEASURE"));
		obj.setWEIGHT(rs.getBigDecimal("WEIGHT"));
		obj.setPACKAGEID(rs.getString("PACKAGEID"));
		obj.setTRACKINGID(rs.getString("TRACKINGID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setMANIFEST_ID(rs.getBigDecimal("MANIFEST_ID"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setMANIFESTSTATUS(rs.getString("MANIFESTSTATUS"));
		obj.setSHIPPINGCOSTS(rs.getBigDecimal("SHIPPINGCOSTS"));
		obj.setDATESHIPPED(rs.getTimestamp("DATESHIPPED"));
		obj.setPICKUPRECORDID(rs.getString("PICKUPRECORDID"));
		
		return obj;
	}

}
