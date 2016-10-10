package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BZSRVCFG;

public class BZSRVCFGRowMapper<T> implements RowMapper<BZSRVCFG> {

	@Override
	public BZSRVCFG mapRow(ResultSet rs, int rowNum) throws SQLException {
		BZSRVCFG obj = new BZSRVCFG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSERVERNAME(rs.getString("SERVERNAME"));
		obj.setENABLED(rs.getBigDecimal("ENABLED"));
		obj.setBZSRVCFG_ID(rs.getBigDecimal("BZSRVCFG_ID"));
		
		return obj;
	}

}
