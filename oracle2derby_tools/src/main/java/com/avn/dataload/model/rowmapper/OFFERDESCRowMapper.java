package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OFFERDESC;

public class OFFERDESCRowMapper<T> implements RowMapper<OFFERDESC> {

	@Override
	public OFFERDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		OFFERDESC obj = new OFFERDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOFFER_ID(rs.getBigDecimal("OFFER_ID"));
		
		return obj;
	}

}
