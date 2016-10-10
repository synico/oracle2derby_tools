package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MGPTRDPSCN;

public class MGPTRDPSCNRowMapper<T> implements RowMapper<MGPTRDPSCN> {

	@Override
	public MGPTRDPSCN mapRow(ResultSet rs, int rowNum) throws SQLException {
		MGPTRDPSCN obj = new MGPTRDPSCN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMBRGRP_ID(rs.getBigDecimal("MBRGRP_ID"));
		obj.setTRADEPOSCN_ID(rs.getBigDecimal("TRADEPOSCN_ID"));
		
		return obj;
	}

}
