package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSCCREPORTCOLHEADR;

public class XSCCREPORTCOLHEADRRowMapper<T> implements RowMapper<XSCCREPORTCOLHEADR> {

	@Override
	public XSCCREPORTCOLHEADR mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSCCREPORTCOLHEADR obj = new XSCCREPORTCOLHEADR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setREPORT_ID(rs.getBigDecimal("REPORT_ID"));
		obj.setACTUALNAME(rs.getString("ACTUALNAME"));
		obj.setREPORTCOLHEADER_ID(rs.getBigDecimal("REPORTCOLHEADER_ID"));
		obj.setUSERSPECIFICNAME(rs.getString("USERSPECIFICNAME"));
		obj.setCOLHEADERORDER(rs.getBigDecimal("COLHEADERORDER"));
		
		return obj;
	}

}
