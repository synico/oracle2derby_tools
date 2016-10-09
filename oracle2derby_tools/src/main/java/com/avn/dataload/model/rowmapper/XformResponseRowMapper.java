package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformResponse;

public class XformResponseRowMapper<T> implements RowMapper<XformResponse> {

	@Override
	public XformResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformResponse obj = new XformResponse();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOrgId(rs.getString("ORG_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPartyId(rs.getString("PARTY_ID"));
		
		return obj;
	}

}
