package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_RESPONSE_EXPORT_COMP;

public class XFORM_RESPONSE_EXPORT_COMPRowMapper<T> implements RowMapper<XFORM_RESPONSE_EXPORT_COMP> {

	@Override
	public XFORM_RESPONSE_EXPORT_COMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_RESPONSE_EXPORT_COMP obj = new XFORM_RESPONSE_EXPORT_COMP();
		
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_RESPONSE_ID(rs.getBigDecimal("FORM_RESPONSE_ID"));
		
		return obj;
	}

}
