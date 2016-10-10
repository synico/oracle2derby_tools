package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ROLE;

public class ROLERowMapper<T> implements RowMapper<ROLE> {

	@Override
	public ROLE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ROLE obj = new ROLE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		return obj;
	}

}
