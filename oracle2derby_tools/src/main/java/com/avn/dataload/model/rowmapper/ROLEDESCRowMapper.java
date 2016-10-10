package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ROLEDESC;

public class ROLEDESCRowMapper<T> implements RowMapper<ROLEDESC> {

	@Override
	public ROLEDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ROLEDESC obj = new ROLEDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		return obj;
	}

}
