package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLTYPEDESC;

public class FLTYPEDESCRowMapper<T> implements RowMapper<FLTYPEDESC> {

	@Override
	public FLTYPEDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLTYPEDESC obj = new FLTYPEDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		
		return obj;
	}

}
