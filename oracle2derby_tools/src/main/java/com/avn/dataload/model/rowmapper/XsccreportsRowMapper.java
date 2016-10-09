package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xsccreports;

public class XsccreportsRowMapper<T> implements RowMapper<Xsccreports> {

	@Override
	public Xsccreports mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xsccreports obj = new Xsccreports();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setReportcreateddate(rs.getDate("REPORTCREATEDDATE"));
		obj.setReportfilters(rs.getString("REPORTFILTERS"));
		obj.setReportlastupdateddate(rs.getDate("REPORTLASTUPDATEDDATE"));
		obj.setSendreportemailids(rs.getString("SENDREPORTEMAILIDS"));
		obj.setReportcomments(rs.getString("REPORTCOMMENTS"));
		obj.setNextinvocationtime(rs.getDate("NEXTINVOCATIONTIME"));
		obj.setReportstatus(rs.getString("REPORTSTATUS"));
		obj.setReportId(rs.getBigDecimal("REPORT_ID"));
		obj.setReporttype(rs.getString("REPORTTYPE"));
		obj.setReportname(rs.getString("REPORTNAME"));
		obj.setReportfrequency(rs.getString("REPORTFREQUENCY"));
		obj.setReportscheduledtime(rs.getDate("REPORTSCHEDULEDTIME"));
		obj.setReportscheduleddate(rs.getBigDecimal("REPORTSCHEDULEDDATE"));
		obj.setReportscheduledday(rs.getString("REPORTSCHEDULEDDAY"));
		
		return obj;
	}

}
