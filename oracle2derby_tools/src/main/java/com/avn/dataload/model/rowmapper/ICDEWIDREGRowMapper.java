package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICDEWIDREG;

public class ICDEWIDREGRowMapper<T> implements RowMapper<ICDEWIDREG> {

	@Override
	public ICDEWIDREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICDEWIDREG obj = new ICDEWIDREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setORDERSEQ(rs.getBigDecimal("ORDERSEQ"));
		
		return obj;
	}

}
