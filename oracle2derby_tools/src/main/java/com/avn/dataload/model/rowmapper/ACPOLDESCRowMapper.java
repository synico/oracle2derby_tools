package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACPOLDESC;

public class ACPOLDESCRowMapper<T> implements RowMapper<ACPOLDESC> {

	@Override
	public ACPOLDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACPOLDESC obj = new ACPOLDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setACPOLICY_ID(rs.getBigDecimal("ACPOLICY_ID"));
		
		return obj;
	}

}
