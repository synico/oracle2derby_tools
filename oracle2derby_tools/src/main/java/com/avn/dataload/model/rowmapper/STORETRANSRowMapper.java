package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORETRANS;

public class STORETRANSRowMapper<T> implements RowMapper<STORETRANS> {

    private static final Logger log = Logger.getLogger(STORETRANSRowMapper.class);

	@Override
	public STORETRANS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORETRANS obj = new STORETRANS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setACTIVE(rs.getBigDecimal("ACTIVE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
