package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CONTRACT;

public class CONTRACTRowMapper<T> implements RowMapper<CONTRACT> {

    private static final Logger log = Logger.getLogger(CONTRACTRowMapper.class);

	@Override
	public CONTRACT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CONTRACT obj = new CONTRACT();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTIMEAPPROVED(rs.getTimestamp("TIMEAPPROVED"));
		obj.setTIMEACTIVATED(rs.getTimestamp("TIMEACTIVATED"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setUSAGE(rs.getBigDecimal("USAGE"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		obj.setMAJORVERSION(rs.getBigDecimal("MAJORVERSION"));
		obj.setMINORVERSION(rs.getBigDecimal("MINORVERSION"));
		obj.setTIMEDEPLOYED(rs.getTimestamp("TIMEDEPLOYED"));
		obj.setORIGIN(rs.getBigDecimal("ORIGIN"));
		obj.setFAMILY_ID(rs.getBigDecimal("FAMILY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
