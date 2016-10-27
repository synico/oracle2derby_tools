package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETDEFDESC;

public class PLWIDGETDEFDESCRowMapper<T> implements RowMapper<PLWIDGETDEFDESC> {

    private static final Logger log = Logger.getLogger(PLWIDGETDEFDESCRowMapper.class);

	@Override
	public PLWIDGETDEFDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETDEFDESC obj = new PLWIDGETDEFDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
