package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAGDISPLAY;

public class TAGDISPLAYRowMapper<T> implements RowMapper<TAGDISPLAY> {

	@Override
	public TAGDISPLAY mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAGDISPLAY obj = new TAGDISPLAY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setTHUMBNAILPATH(rs.getString("THUMBNAILPATH"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		
		return obj;
	}

}
