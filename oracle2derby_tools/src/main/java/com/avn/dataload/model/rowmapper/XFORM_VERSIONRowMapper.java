package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_VERSION;

public class XFORM_VERSIONRowMapper<T> implements RowMapper<XFORM_VERSION> {

    private static final Logger log = Logger.getLogger(XFORM_VERSIONRowMapper.class);

	@Override
	public XFORM_VERSION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_VERSION obj = new XFORM_VERSION();
		
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_VERSION_DS(rs.getString("FORM_VERSION_DS"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
