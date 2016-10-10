package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACATTRDESC;

public class ACATTRDESCRowMapper<T> implements RowMapper<ACATTRDESC> {

	@Override
	public ACATTRDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACATTRDESC obj = new ACATTRDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACATTR_ID(rs.getBigDecimal("ACATTR_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
