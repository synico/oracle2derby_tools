package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYMTHD;

public class PAYMTHDRowMapper<T> implements RowMapper<PAYMTHD> {

	@Override
	public PAYMTHD mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYMTHD obj = new PAYMTHD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROFILENAME(rs.getString("PROFILENAME"));
		obj.setPAYMTHD_ID(rs.getBigDecimal("PAYMTHD_ID"));
		
		return obj;
	}

}
