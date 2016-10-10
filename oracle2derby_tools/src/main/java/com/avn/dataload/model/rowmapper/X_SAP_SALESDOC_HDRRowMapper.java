package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_SAP_SALESDOC_HDR;

public class X_SAP_SALESDOC_HDRRowMapper<T> implements RowMapper<X_SAP_SALESDOC_HDR> {

	@Override
	public X_SAP_SALESDOC_HDR mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_SAP_SALESDOC_HDR obj = new X_SAP_SALESDOC_HDR();
		
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setVBAK_VBELN(rs.getString("VBAK_VBELN"));
		obj.setSOLD_TO(rs.getString("SOLD_TO"));
		obj.setVBAK_AUART(rs.getString("VBAK_AUART"));
		obj.setVBKD_BSTDK(rs.getTimestamp("VBKD_BSTDK"));
		
		return obj;
	}

}
