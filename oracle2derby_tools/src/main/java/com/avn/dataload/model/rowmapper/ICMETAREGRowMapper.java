package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICMETAREG;

public class ICMETAREGRowMapper<T> implements RowMapper<ICMETAREG> {

	@Override
	public ICMETAREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICMETAREG obj = new ICMETAREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setEXPLSPCREQ(rs.getBigDecimal("EXPLSPCREQ"));
		obj.setMETAPHORTYPEID(rs.getBigDecimal("METAPHORTYPEID"));
		obj.setBUILDERNAME(rs.getString("BUILDERNAME"));
		
		return obj;
	}

}
