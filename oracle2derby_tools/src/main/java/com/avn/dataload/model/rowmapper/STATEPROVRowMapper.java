package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STATEPROV;

public class STATEPROVRowMapper<T> implements RowMapper<STATEPROV> {

	@Override
	public STATEPROV mapRow(ResultSet rs, int rowNum) throws SQLException {
		STATEPROV obj = new STATEPROV();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCOUNTRYABBR(rs.getString("COUNTRYABBR"));
		obj.setSTATEPROVABBR(rs.getString("STATEPROVABBR"));
		
		return obj;
	}

}
