package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICDEWIDREG;

public class ICDEWIDREGRowMapper<T> implements RowMapper<ICDEWIDREG> {

    private static final Logger log = Logger.getLogger(ICDEWIDREGRowMapper.class);

	@Override
	public ICDEWIDREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICDEWIDREG obj = new ICDEWIDREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setORDERSEQ(rs.getBigDecimal("ORDERSEQ"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
