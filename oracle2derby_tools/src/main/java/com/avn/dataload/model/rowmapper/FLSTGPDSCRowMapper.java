package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTGPDSC;

public class FLSTGPDSCRowMapper<T> implements RowMapper<FLSTGPDSC> {

	@Override
	public FLSTGPDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTGPDSC obj = new FLSTGPDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFLSTATEGP_ID(rs.getBigDecimal("FLSTATEGP_ID"));
		
		return obj;
	}

}
