package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XMDMMATERIALSTS;

public class XMDMMATERIALSTSRowMapper<T> implements RowMapper<XMDMMATERIALSTS> {

    private static final Logger log = Logger.getLogger(XMDMMATERIALSTSRowMapper.class);

	@Override
	public XMDMMATERIALSTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XMDMMATERIALSTS obj = new XMDMMATERIALSTS();
		
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMDMMATERIALNUMBER(rs.getString("MDMMATERIALNUMBER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
