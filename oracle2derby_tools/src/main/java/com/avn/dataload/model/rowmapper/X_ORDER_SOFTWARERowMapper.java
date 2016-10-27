package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ORDER_SOFTWARE;

public class X_ORDER_SOFTWARERowMapper<T> implements RowMapper<X_ORDER_SOFTWARE> {

    private static final Logger log = Logger.getLogger(X_ORDER_SOFTWARERowMapper.class);

	@Override
	public X_ORDER_SOFTWARE mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ORDER_SOFTWARE obj = new X_ORDER_SOFTWARE();
		
		obj.setFIRST_NM(rs.getString("FIRST_NM"));
		obj.setLAST_NM(rs.getString("LAST_NM"));
		obj.setEMAIL_ADDRESS_TX(rs.getString("EMAIL_ADDRESS_TX"));
		obj.setSOFTWARE_PROCESS_CD(rs.getString("SOFTWARE_PROCESS_CD"));
		obj.setSOFTWARE_VOUCHER_NO(rs.getString("SOFTWARE_VOUCHER_NO"));
		obj.setAPPL_CREATE_DT(rs.getTimestamp("APPL_CREATE_DT"));
		obj.setAPPL_UPDATE_DT(rs.getTimestamp("APPL_UPDATE_DT"));
		obj.setSOFTWARE_AUTHORIZER_CD(rs.getString("SOFTWARE_AUTHORIZER_CD"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
