package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSCCREPORTSTATUS;

public class XSCCREPORTSTATUSRowMapper<T> implements RowMapper<XSCCREPORTSTATUS> {

    private static final Logger log = Logger.getLogger(XSCCREPORTSTATUSRowMapper.class);

	@Override
	public XSCCREPORTSTATUS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSCCREPORTSTATUS obj = new XSCCREPORTSTATUS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLASTREPORTSENDTIME(rs.getTimestamp("LASTREPORTSENDTIME"));
		obj.setREPORTSENDSTATUS(rs.getString("REPORTSENDSTATUS"));
		obj.setLASTREPORTGENERATEDTIME(rs.getTimestamp("LASTREPORTGENERATEDTIME"));
		obj.setREPORT_ID(rs.getBigDecimal("REPORT_ID"));
		obj.setREPORTNAME(rs.getString("REPORTNAME"));
		obj.setREPORTLOC(rs.getString("REPORTLOC"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
