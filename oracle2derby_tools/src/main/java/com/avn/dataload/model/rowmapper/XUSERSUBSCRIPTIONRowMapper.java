package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XUSERSUBSCRIPTION;

public class XUSERSUBSCRIPTIONRowMapper<T> implements RowMapper<XUSERSUBSCRIPTION> {

	@Override
	public XUSERSUBSCRIPTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XUSERSUBSCRIPTION obj = new XUSERSUBSCRIPTION();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setLOGON_ID(rs.getString("LOGON_ID"));
		obj.setSUBSCRIBED(rs.getString("SUBSCRIBED"));
		obj.setSYNCSTATUS(rs.getString("SYNCSTATUS"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setTIME_CREATED(rs.getTimestamp("TIME_CREATED"));
		obj.setTIME_SUBSCRIBED(rs.getTimestamp("TIME_SUBSCRIBED"));
		obj.setTIME_UNSUBSCRIBED(rs.getTimestamp("TIME_UNSUBSCRIBED"));
		obj.setLASTUPDATED(rs.getTimestamp("LASTUPDATED"));
		
		return obj;
	}

}
