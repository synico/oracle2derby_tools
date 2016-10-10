package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALCODEDSC;

public class CALCODEDSCRowMapper<T> implements RowMapper<CALCODEDSC> {

	@Override
	public CALCODEDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALCODEDSC obj = new CALCODEDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		
		return obj;
	}

}
