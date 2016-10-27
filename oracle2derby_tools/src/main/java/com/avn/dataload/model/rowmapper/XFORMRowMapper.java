package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM;

public class XFORMRowMapper<T> implements RowMapper<XFORM> {

    private static final Logger log = Logger.getLogger(XFORMRowMapper.class);

	@Override
	public XFORM mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM obj = new XFORM();
		
		obj.setFORM_TYPE_CD(rs.getString("FORM_TYPE_CD"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		obj.setFORM_NM(rs.getString("FORM_NM"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
