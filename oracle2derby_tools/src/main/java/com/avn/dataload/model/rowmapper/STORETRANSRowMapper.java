package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORETRANS;

public class STORETRANSRowMapper<T> implements RowMapper<STORETRANS> {

	@Override
	public STORETRANS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORETRANS obj = new STORETRANS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setACTIVE(rs.getBigDecimal("ACTIVE"));
		
		return obj;
	}

}
