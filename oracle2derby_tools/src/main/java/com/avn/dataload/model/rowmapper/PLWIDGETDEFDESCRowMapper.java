package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETDEFDESC;

public class PLWIDGETDEFDESCRowMapper<T> implements RowMapper<PLWIDGETDEFDESC> {

	@Override
	public PLWIDGETDEFDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETDEFDESC obj = new PLWIDGETDEFDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		
		return obj;
	}

}
