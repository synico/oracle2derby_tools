package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWDESC;

public class FLOWDESCRowMapper<T> implements RowMapper<FLOWDESC> {

	@Override
	public FLOWDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWDESC obj = new FLOWDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		
		return obj;
	}

}
