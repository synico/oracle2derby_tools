package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xusersubscription;

public class XusersubscriptionRowMapper<T> implements RowMapper<Xusersubscription> {

	@Override
	public Xusersubscription mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xusersubscription obj = new Xusersubscription();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setLastupdated(rs.getDate("LASTUPDATED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setTimeCreated(rs.getDate("TIME_CREATED"));
		obj.setTimeSubscribed(rs.getDate("TIME_SUBSCRIBED"));
		obj.setTimeUnsubscribed(rs.getDate("TIME_UNSUBSCRIBED"));
		obj.setSubscribed(rs.getString("SUBSCRIBED"));
		obj.setSyncstatus(rs.getString("SYNCSTATUS"));
		
		return obj;
	}

}
