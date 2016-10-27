package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_SAP_SALESDOC_HDR;

public class X_SAP_SALESDOC_HDRRowMapper<T> implements RowMapper<X_SAP_SALESDOC_HDR> {

    private static final Logger log = Logger.getLogger(X_SAP_SALESDOC_HDRRowMapper.class);

	@Override
	public X_SAP_SALESDOC_HDR mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_SAP_SALESDOC_HDR obj = new X_SAP_SALESDOC_HDR();
		
		obj.setVBAK_VBELN(rs.getString("VBAK_VBELN"));
		obj.setSOLD_TO(rs.getString("SOLD_TO"));
		obj.setVBAK_AUART(rs.getString("VBAK_AUART"));
		obj.setVBKD_BSTDK(rs.getTimestamp("VBKD_BSTDK"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
