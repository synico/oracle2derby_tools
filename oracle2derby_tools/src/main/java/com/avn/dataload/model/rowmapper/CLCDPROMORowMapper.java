package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CLCDPROMO;

public class CLCDPROMORowMapper<T> implements RowMapper<CLCDPROMO> {

	@Override
	public CLCDPROMO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CLCDPROMO obj = new CLCDPROMO();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		
		return obj;
	}

}
