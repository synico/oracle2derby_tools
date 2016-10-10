package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLDOMNDESC;

public class FLDOMNDESCRowMapper<T> implements RowMapper<FLDOMNDESC> {

	@Override
	public FLDOMNDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLDOMNDESC obj = new FLDOMNDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		
		return obj;
	}

}
