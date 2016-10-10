package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRELDESC;

public class ACRELDESCRowMapper<T> implements RowMapper<ACRELDESC> {

	@Override
	public ACRELDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRELDESC obj = new ACRELDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		
		return obj;
	}

}
