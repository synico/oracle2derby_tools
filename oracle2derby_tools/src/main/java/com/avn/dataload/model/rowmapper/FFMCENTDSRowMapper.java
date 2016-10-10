package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FFMCENTDS;

public class FFMCENTDSRowMapper<T> implements RowMapper<FFMCENTDS> {

	@Override
	public FFMCENTDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		FFMCENTDS obj = new FFMCENTDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setSTADDRESS_ID(rs.getBigDecimal("STADDRESS_ID"));
		
		return obj;
	}

}
