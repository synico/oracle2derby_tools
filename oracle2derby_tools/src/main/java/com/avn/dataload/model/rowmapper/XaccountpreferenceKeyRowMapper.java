package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XaccountpreferenceKey;

public class XaccountpreferenceKeyRowMapper<T> implements RowMapper<XaccountpreferenceKey> {

	@Override
	public XaccountpreferenceKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XaccountpreferenceKey obj = new XaccountpreferenceKey();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setPreferencetype(rs.getString("PREFERENCETYPE"));
		
		return obj;
	}

}
