package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XMDMMATERIALSTS;

public class XMDMMATERIALSTSRowMapper<T> implements RowMapper<XMDMMATERIALSTS> {

	@Override
	public XMDMMATERIALSTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XMDMMATERIALSTS obj = new XMDMMATERIALSTS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setMDMMATERIALNUMBER(rs.getString("MDMMATERIALNUMBER"));
		
		return obj;
	}

}
