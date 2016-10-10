package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CONTRACT;

public class CONTRACTRowMapper<T> implements RowMapper<CONTRACT> {

	@Override
	public CONTRACT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CONTRACT obj = new CONTRACT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTIMEAPPROVED(rs.getTimestamp("TIMEAPPROVED"));
		obj.setTIMEACTIVATED(rs.getTimestamp("TIMEACTIVATED"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		obj.setUSAGE(rs.getBigDecimal("USAGE"));
		obj.setORIGIN(rs.getBigDecimal("ORIGIN"));
		obj.setFAMILY_ID(rs.getBigDecimal("FAMILY_ID"));
		obj.setMAJORVERSION(rs.getBigDecimal("MAJORVERSION"));
		obj.setMINORVERSION(rs.getBigDecimal("MINORVERSION"));
		obj.setTIMEDEPLOYED(rs.getTimestamp("TIMEDEPLOYED"));
		
		return obj;
	}

}
