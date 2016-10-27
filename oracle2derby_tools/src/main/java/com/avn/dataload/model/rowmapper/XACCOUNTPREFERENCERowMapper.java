package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XACCOUNTPREFERENCE;

public class XACCOUNTPREFERENCERowMapper<T> implements RowMapper<XACCOUNTPREFERENCE> {

    private static final Logger log = Logger.getLogger(XACCOUNTPREFERENCERowMapper.class);

	@Override
	public XACCOUNTPREFERENCE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XACCOUNTPREFERENCE obj = new XACCOUNTPREFERENCE();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setPREFERENCETYPE(rs.getString("PREFERENCETYPE"));
		obj.setPREFERENCE_ID(rs.getString("PREFERENCE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
