package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYMTHDSUP;

public class PAYMTHDSUPRowMapper<T> implements RowMapper<PAYMTHDSUP> {

	@Override
	public PAYMTHDSUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYMTHDSUP obj = new PAYMTHDSUP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPAYMTHD_ID(rs.getBigDecimal("PAYMTHD_ID"));
		
		return obj;
	}

}
