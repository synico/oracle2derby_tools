package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMACTATTR;

public class DMACTATTRRowMapper<T> implements RowMapper<DMACTATTR> {

	@Override
	public DMACTATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMACTATTR obj = new DMACTATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPROCESSED(rs.getTimestamp("PROCESSED"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		
		return obj;
	}

}
