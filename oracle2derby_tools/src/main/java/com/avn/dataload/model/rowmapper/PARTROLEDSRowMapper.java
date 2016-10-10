package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PARTROLEDS;

public class PARTROLEDSRowMapper<T> implements RowMapper<PARTROLEDS> {

	@Override
	public PARTROLEDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		PARTROLEDS obj = new PARTROLEDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPARTROLE_ID(rs.getBigDecimal("PARTROLE_ID"));
		
		return obj;
	}

}
