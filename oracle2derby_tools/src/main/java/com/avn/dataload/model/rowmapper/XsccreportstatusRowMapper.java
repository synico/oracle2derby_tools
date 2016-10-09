package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsccreportstatus;

public class XsccreportstatusRowMapper<T> implements RowMapper<Xsccreportstatus> {

	@Override
	public Xsccreportstatus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsccreportstatus obj = new Xsccreportstatus();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastreportsendtime(rs.getDate("LASTREPORTSENDTIME"));
		obj.setReportsendstatus(rs.getString("REPORTSENDSTATUS"));
		obj.setLastreportgeneratedtime(rs.getDate("LASTREPORTGENERATEDTIME"));
		obj.setReportId(rs.getBigDecimal("REPORT_ID"));
		obj.setReportname(rs.getString("REPORTNAME"));
		obj.setReportloc(rs.getString("REPORTLOC"));
		
		return obj;
	}

}
