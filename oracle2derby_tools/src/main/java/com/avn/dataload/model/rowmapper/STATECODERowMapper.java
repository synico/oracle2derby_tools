package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STATECODE;

public class STATECODERowMapper<T> implements RowMapper<STATECODE> {

	@Override
	public STATECODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		STATECODE obj = new STATECODE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRODUCTVENDOR(rs.getString("PRODUCTVENDOR"));
		obj.setSTATEPROVABBR(rs.getString("STATEPROVABBR"));
		obj.setSTATEPROVCODE(rs.getString("STATEPROVCODE"));
		
		return obj;
	}

}
