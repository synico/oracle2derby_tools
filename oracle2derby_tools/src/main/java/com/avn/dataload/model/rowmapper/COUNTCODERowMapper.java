package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COUNTCODE;

public class COUNTCODERowMapper<T> implements RowMapper<COUNTCODE> {

	@Override
	public COUNTCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		COUNTCODE obj = new COUNTCODE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRODUCTVENDOR(rs.getString("PRODUCTVENDOR"));
		obj.setCOUNTRYABBR(rs.getString("COUNTRYABBR"));
		obj.setCOUNTRYCODE(rs.getString("COUNTRYCODE"));
		
		return obj;
	}

}
