package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFORM_RESALE_ADDRESS;

public class XFORM_RESALE_ADDRESSRowMapper<T> implements RowMapper<XFORM_RESALE_ADDRESS> {

    private static final Logger log = Logger.getLogger(XFORM_RESALE_ADDRESSRowMapper.class);

	@Override
	public XFORM_RESALE_ADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFORM_RESALE_ADDRESS obj = new XFORM_RESALE_ADDRESS();
		
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFORM_VERSION_ID(rs.getBigDecimal("FORM_VERSION_ID"));
		obj.setFORM_QUESTION_ID(rs.getBigDecimal("FORM_QUESTION_ID"));
		obj.setFORM_RESPONSE_ID(rs.getBigDecimal("FORM_RESPONSE_ID"));
		obj.setFORM_RESALE_ADDRESS_ID(rs.getBigDecimal("FORM_RESALE_ADDRESS_ID"));
		obj.setRESALE_ADDRESS_TX_01(rs.getString("RESALE_ADDRESS_TX_01"));
		obj.setRESALE_ADDRESS_TX_02(rs.getString("RESALE_ADDRESS_TX_02"));
		obj.setRESALE_ADDRESS_TX_03(rs.getString("RESALE_ADDRESS_TX_03"));
		obj.setRESALE_CITY_NM(rs.getString("RESALE_CITY_NM"));
		obj.setRESALE_COMPANY_NM(rs.getString("RESALE_COMPANY_NM"));
		obj.setRESALE_COUNTRY_NM(rs.getString("RESALE_COUNTRY_NM"));
		obj.setRESALE_STATE_NM(rs.getString("RESALE_STATE_NM"));
		obj.setRESALE_POSTAL_CD(rs.getString("RESALE_POSTAL_CD"));
		obj.setFORM_ID(rs.getBigDecimal("FORM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
