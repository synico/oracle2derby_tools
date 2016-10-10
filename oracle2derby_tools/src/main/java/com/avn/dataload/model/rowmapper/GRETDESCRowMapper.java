package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.GRETDESC;

public class GRETDESCRowMapper<T> implements RowMapper<GRETDESC> {

	@Override
	public GRETDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		GRETDESC obj = new GRETDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setEVENTTYPE_ID(rs.getBigDecimal("EVENTTYPE_ID"));
		
		return obj;
	}

}
