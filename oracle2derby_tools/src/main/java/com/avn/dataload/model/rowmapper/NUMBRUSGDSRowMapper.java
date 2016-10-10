package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.NUMBRUSGDS;

public class NUMBRUSGDSRowMapper<T> implements RowMapper<NUMBRUSGDS> {

	@Override
	public NUMBRUSGDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		NUMBRUSGDS obj = new NUMBRUSGDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
