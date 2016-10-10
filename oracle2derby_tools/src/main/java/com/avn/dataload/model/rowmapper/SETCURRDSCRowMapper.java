package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SETCURRDSC;

public class SETCURRDSCRowMapper<T> implements RowMapper<SETCURRDSC> {

	@Override
	public SETCURRDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SETCURRDSC obj = new SETCURRDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		
		return obj;
	}

}
