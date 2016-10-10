package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PARTROLE;

public class PARTROLERowMapper<T> implements RowMapper<PARTROLE> {

	@Override
	public PARTROLE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PARTROLE obj = new PARTROLE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPARTROLE_ID(rs.getBigDecimal("PARTROLE_ID"));
		
		return obj;
	}

}
