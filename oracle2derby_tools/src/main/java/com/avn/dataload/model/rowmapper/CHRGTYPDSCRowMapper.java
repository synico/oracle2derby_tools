package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHRGTYPDSC;

public class CHRGTYPDSCRowMapper<T> implements RowMapper<CHRGTYPDSC> {

	@Override
	public CHRGTYPDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHRGTYPDSC obj = new CHRGTYPDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCHARGETYPE_ID(rs.getBigDecimal("CHARGETYPE_ID"));
		
		return obj;
	}

}
