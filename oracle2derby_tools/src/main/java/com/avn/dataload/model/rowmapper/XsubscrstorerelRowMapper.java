package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsubscrstorerel;

public class XsubscrstorerelRowMapper<T> implements RowMapper<Xsubscrstorerel> {

	@Override
	public Xsubscrstorerel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsubscrstorerel obj = new Xsubscrstorerel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setSubscriptionId(rs.getBigDecimal("SUBSCRIPTION_ID"));
		
		return obj;
	}

}
