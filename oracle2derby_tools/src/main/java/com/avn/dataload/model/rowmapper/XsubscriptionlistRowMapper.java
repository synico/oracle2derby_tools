package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsubscriptionlist;

public class XsubscriptionlistRowMapper<T> implements RowMapper<Xsubscriptionlist> {

	@Override
	public Xsubscriptionlist mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsubscriptionlist obj = new Xsubscriptionlist();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setSubscriptionId(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setSubscriptionName(rs.getString("SUBSCRIPTION_NAME"));
		obj.setSourceId(rs.getBigDecimal("SOURCE_ID"));
		
		return obj;
	}

}
