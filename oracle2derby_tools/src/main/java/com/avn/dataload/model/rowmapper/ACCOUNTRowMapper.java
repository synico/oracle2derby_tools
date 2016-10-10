package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACCOUNT;

public class ACCOUNTRowMapper<T> implements RowMapper<ACCOUNT> {

	@Override
	public ACCOUNT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACCOUNT obj = new ACCOUNT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setDEFAULTCONTRACT(rs.getBigDecimal("DEFAULTCONTRACT"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setTIMEAPPROVED(rs.getTimestamp("TIMEAPPROVED"));
		obj.setTIMEACTIVATED(rs.getTimestamp("TIMEACTIVATED"));
		obj.setPRCPLCYPREF(rs.getString("PRCPLCYPREF"));
		obj.setUSEPRCPLCYPREF(rs.getBigDecimal("USEPRCPLCYPREF"));
		
		return obj;
	}

}
