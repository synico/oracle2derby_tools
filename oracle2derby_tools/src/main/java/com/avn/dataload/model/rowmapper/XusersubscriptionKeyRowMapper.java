package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XusersubscriptionKey;

public class XusersubscriptionKeyRowMapper<T> implements RowMapper<XusersubscriptionKey> {

	@Override
	public XusersubscriptionKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XusersubscriptionKey obj = new XusersubscriptionKey();
		
		obj.setSubscriptionId(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setLogonId(rs.getString("LOGON_ID"));
		
		return obj;
	}

}
