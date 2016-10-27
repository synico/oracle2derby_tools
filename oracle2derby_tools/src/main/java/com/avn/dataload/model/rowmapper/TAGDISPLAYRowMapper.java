package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAGDISPLAY;

public class TAGDISPLAYRowMapper<T> implements RowMapper<TAGDISPLAY> {

    private static final Logger log = Logger.getLogger(TAGDISPLAYRowMapper.class);

	@Override
	public TAGDISPLAY mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAGDISPLAY obj = new TAGDISPLAY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		obj.setTHUMBNAILPATH(rs.getString("THUMBNAILPATH"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
