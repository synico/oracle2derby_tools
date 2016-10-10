package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFILEDIR;

public class CMFILEDIRRowMapper<T> implements RowMapper<CMFILEDIR> {

	@Override
	public CMFILEDIR mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFILEDIR obj = new CMFILEDIR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setCMFILEDIR_ID(rs.getBigDecimal("CMFILEDIR_ID"));
		obj.setCMFILEDIR_PARENT(rs.getBigDecimal("CMFILEDIR_PARENT"));
		
		return obj;
	}

}
