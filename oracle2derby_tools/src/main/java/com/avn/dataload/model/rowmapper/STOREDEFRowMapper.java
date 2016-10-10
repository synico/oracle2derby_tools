package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREDEF;

public class STOREDEFRowMapper<T> implements RowMapper<STOREDEF> {

	@Override
	public STOREDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREDEF obj = new STOREDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		
		return obj;
	}

}
