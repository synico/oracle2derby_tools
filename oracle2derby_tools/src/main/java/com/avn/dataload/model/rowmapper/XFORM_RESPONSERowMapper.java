package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_RESPONSE;

public class XFORM_RESPONSERowMapper<T> implements RowMapper<XFORM_RESPONSE> {

	@Override
	public XFORM_RESPONSE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_RESPONSE obj = new XFORM_RESPONSE();
		
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setORG_ID(rs.getString("ORG_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setPARTY_ID(rs.getString("PARTY_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_RESPONSE_ID(rs.getBigDecimal("FORM_RESPONSE_ID"));
		
		return obj;
	}

}
