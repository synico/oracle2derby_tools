package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWTYPE;

public class FLOWTYPERowMapper<T> implements RowMapper<FLOWTYPE> {

	@Override
	public FLOWTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWTYPE obj = new FLOWTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setBIZFLOWBEANCLASS(rs.getString("BIZFLOWBEANCLASS"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setATTRIBUTE(rs.getString("ATTRIBUTE"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
