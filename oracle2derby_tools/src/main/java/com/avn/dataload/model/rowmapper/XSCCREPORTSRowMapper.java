package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSCCREPORTS;

public class XSCCREPORTSRowMapper<T> implements RowMapper<XSCCREPORTS> {

	@Override
	public XSCCREPORTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSCCREPORTS obj = new XSCCREPORTS();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setREPORT_ID(rs.getBigDecimal("REPORT_ID"));
		obj.setREPORTTYPE(rs.getString("REPORTTYPE"));
		obj.setREPORTNAME(rs.getString("REPORTNAME"));
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
		
		return obj;
	}

}
