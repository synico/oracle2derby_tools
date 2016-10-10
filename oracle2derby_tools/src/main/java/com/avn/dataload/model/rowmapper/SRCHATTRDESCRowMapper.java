package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHATTRDESC;

public class SRCHATTRDESCRowMapper<T> implements RowMapper<SRCHATTRDESC> {

	@Override
	public SRCHATTRDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHATTRDESC obj = new SRCHATTRDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		
		return obj;
	}

}
