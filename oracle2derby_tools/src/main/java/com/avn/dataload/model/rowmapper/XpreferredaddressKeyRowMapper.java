package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XpreferredaddressKey;

public class XpreferredaddressKeyRowMapper<T> implements RowMapper<XpreferredaddressKey> {

	@Override
	public XpreferredaddressKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XpreferredaddressKey obj = new XpreferredaddressKey();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setOrganizationId(rs.getBigDecimal("ORGANIZATION_ID"));
		
		return obj;
	}

}
