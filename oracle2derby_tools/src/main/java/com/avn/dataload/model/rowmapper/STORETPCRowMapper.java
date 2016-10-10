package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORETPC;

public class STORETPCRowMapper<T> implements RowMapper<STORETPC> {

	@Override
	public STORETPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORETPC obj = new STORETPC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setTRADEPOSCN_ID(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setSTTPCUSG_ID(rs.getBigDecimal("STTPCUSG_ID"));
		
		return obj;
	}

}
