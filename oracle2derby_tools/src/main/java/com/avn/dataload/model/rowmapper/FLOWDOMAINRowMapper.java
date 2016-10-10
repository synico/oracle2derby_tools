package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLOWDOMAIN;

public class FLOWDOMAINRowMapper<T> implements RowMapper<FLOWDOMAIN> {

	@Override
	public FLOWDOMAIN mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLOWDOMAIN obj = new FLOWDOMAIN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setFLOWDOMAIN_ID(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		
		return obj;
	}

}
