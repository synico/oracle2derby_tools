package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSCCREPORTS;

public class XSCCREPORTSRowMapper<T> implements RowMapper<XSCCREPORTS> {

    private static final Logger log = Logger.getLogger(XSCCREPORTSRowMapper.class);

	@Override
	public XSCCREPORTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSCCREPORTS obj = new XSCCREPORTS();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setREPORTFREQUENCY(rs.getString("REPORTFREQUENCY"));
		obj.setREPORTSCHEDULEDTIME(rs.getTimestamp("REPORTSCHEDULEDTIME"));
		obj.setREPORTSCHEDULEDDATE(rs.getBigDecimal("REPORTSCHEDULEDDATE"));
		obj.setREPORTSCHEDULEDDAY(rs.getString("REPORTSCHEDULEDDAY"));
		obj.setREPORTCREATEDDATE(rs.getTimestamp("REPORTCREATEDDATE"));
		obj.setREPORTFILTERS(rs.getString("REPORTFILTERS"));
		obj.setREPORTLASTUPDATEDDATE(rs.getTimestamp("REPORTLASTUPDATEDDATE"));
		obj.setSENDREPORTEMAILIDS(rs.getString("SENDREPORTEMAILIDS"));
		obj.setREPORTCOMMENTS(rs.getString("REPORTCOMMENTS"));
		obj.setNEXTINVOCATIONTIME(rs.getTimestamp("NEXTINVOCATIONTIME"));
		obj.setREPORTSTATUS(rs.getString("REPORTSTATUS"));
		obj.setREPORT_ID(rs.getBigDecimal("REPORT_ID"));
		obj.setREPORTTYPE(rs.getString("REPORTTYPE"));
		obj.setREPORTNAME(rs.getString("REPORTNAME"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
