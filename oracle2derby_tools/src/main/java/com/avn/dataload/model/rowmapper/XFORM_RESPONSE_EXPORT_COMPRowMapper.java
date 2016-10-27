package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_RESPONSE_EXPORT_COMP;

public class XFORM_RESPONSE_EXPORT_COMPRowMapper<T> implements RowMapper<XFORM_RESPONSE_EXPORT_COMP> {

    private static final Logger log = Logger.getLogger(XFORM_RESPONSE_EXPORT_COMPRowMapper.class);

	@Override
	public XFORM_RESPONSE_EXPORT_COMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_RESPONSE_EXPORT_COMP obj = new XFORM_RESPONSE_EXPORT_COMP();
		
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_RESPONSE_ID(rs.getBigDecimal("FORM_RESPONSE_ID"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
