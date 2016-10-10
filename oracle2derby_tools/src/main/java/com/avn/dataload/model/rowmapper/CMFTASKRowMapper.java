package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTASK;

public class CMFTASKRowMapper<T> implements RowMapper<CMFTASK> {

	@Override
	public CMFTASK mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTASK obj = new CMFTASK();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setUSAGE(rs.getBigDecimal("USAGE"));
		obj.setCMFTASK_ID(rs.getBigDecimal("CMFTASK_ID"));
		obj.setDUEDATE(rs.getTimestamp("DUEDATE"));
		obj.setCOMPLETEDATE(rs.getTimestamp("COMPLETEDATE"));
		obj.setTEMPLATETYPE(rs.getBigDecimal("TEMPLATETYPE"));
		
		return obj;
	}

}
