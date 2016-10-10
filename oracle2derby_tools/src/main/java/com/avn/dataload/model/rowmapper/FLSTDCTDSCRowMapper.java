package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTDCTDSC;

public class FLSTDCTDSCRowMapper<T> implements RowMapper<FLSTDCTDSC> {

	@Override
	public FLSTDCTDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTDCTDSC obj = new FLSTDCTDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFLSTATEDCT_ID(rs.getBigDecimal("FLSTATEDCT_ID"));
		
		return obj;
	}

}
