package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVADJDESC;

public class INVADJDESCRowMapper<T> implements RowMapper<INVADJDESC> {

	@Override
	public INVADJDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVADJDESC obj = new INVADJDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setINVADJCODE_ID(rs.getBigDecimal("INVADJCODE_ID"));
		
		return obj;
	}

}
