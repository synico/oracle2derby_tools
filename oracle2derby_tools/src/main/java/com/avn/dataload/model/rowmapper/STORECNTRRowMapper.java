package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECNTR;

public class STORECNTRRowMapper<T> implements RowMapper<STORECNTR> {

	@Override
	public STORECNTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECNTR obj = new STORECNTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		
		return obj;
	}

}
