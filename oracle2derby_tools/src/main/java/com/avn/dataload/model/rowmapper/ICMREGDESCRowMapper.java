package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICMREGDESC;

public class ICMREGDESCRowMapper<T> implements RowMapper<ICMREGDESC> {

	@Override
	public ICMREGDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICMREGDESC obj = new ICMREGDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTITLE(rs.getString("TITLE"));
		obj.setICONNAME(rs.getString("ICONNAME"));
		obj.setMETAPHORTYPEID(rs.getBigDecimal("METAPHORTYPEID"));
		
		return obj;
	}

}
