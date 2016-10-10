package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OPERATRDSC;

public class OPERATRDSCRowMapper<T> implements RowMapper<OPERATRDSC> {

	@Override
	public OPERATRDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		OPERATRDSC obj = new OPERATRDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOPERATOR_ID(rs.getBigDecimal("OPERATOR_ID"));
		
		return obj;
	}

}
