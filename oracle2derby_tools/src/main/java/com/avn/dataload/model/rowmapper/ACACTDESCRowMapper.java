package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACACTDESC;

public class ACACTDESCRowMapper<T> implements RowMapper<ACACTDESC> {

	@Override
	public ACACTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACACTDESC obj = new ACACTDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACACTION_ID(rs.getBigDecimal("ACACTION_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
