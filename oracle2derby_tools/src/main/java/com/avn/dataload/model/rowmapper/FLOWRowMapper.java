package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOW;

public class FLOWRowMapper<T> implements RowMapper<FLOW> {

	@Override
	public FLOW mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOW obj = new FLOW();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setCOMPOSITEFLOW(rs.getBigDecimal("COMPOSITEFLOW"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		obj.setATTRIBUTE(rs.getString("ATTRIBUTE"));
		
		return obj;
	}

}
