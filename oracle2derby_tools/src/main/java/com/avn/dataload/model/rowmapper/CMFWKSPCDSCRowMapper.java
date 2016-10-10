package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFWKSPCDSC;

public class CMFWKSPCDSCRowMapper<T> implements RowMapper<CMFWKSPCDSC> {

	@Override
	public CMFWKSPCDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFWKSPCDSC obj = new CMFWKSPCDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCMFWKSPC_ID(rs.getBigDecimal("CMFWKSPC_ID"));
		
		return obj;
	}

}
