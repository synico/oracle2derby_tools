package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_SAP_MSKU;

public class X_SAP_MSKURowMapper<T> implements RowMapper<X_SAP_MSKU> {

    private static final Logger log = Logger.getLogger(X_SAP_MSKURowMapper.class);

	@Override
	public X_SAP_MSKU mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_SAP_MSKU obj = new X_SAP_MSKU();
		
		obj.setMSKU_WERKS(rs.getString("MSKU_WERKS"));
		obj.setMSKU_MATNR(rs.getString("MSKU_MATNR"));
		obj.setMSKU_KUNNR(rs.getString("MSKU_KUNNR"));
		obj.setMSKU_LABST(rs.getBigDecimal("MSKU_LABST"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
