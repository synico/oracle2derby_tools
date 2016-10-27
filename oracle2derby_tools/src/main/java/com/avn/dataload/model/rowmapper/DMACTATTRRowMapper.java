package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMACTATTR;

public class DMACTATTRRowMapper<T> implements RowMapper<DMACTATTR> {

    private static final Logger log = Logger.getLogger(DMACTATTRRowMapper.class);

	@Override
	public DMACTATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMACTATTR obj = new DMACTATTR();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setPROCESSED(rs.getTimestamp("PROCESSED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
