package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsubscriptiondesc;

public class XsubscriptiondescRowMapper<T> implements RowMapper<Xsubscriptiondesc> {

	@Override
	public Xsubscriptiondesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsubscriptiondesc obj = new Xsubscriptiondesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setSubscriptionId(rs.getBigDecimal("SUBSCRIPTION_ID"));
		
		return obj;
	}

}
