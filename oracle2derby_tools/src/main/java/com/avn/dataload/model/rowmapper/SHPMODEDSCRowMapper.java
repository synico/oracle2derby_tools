package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHPMODEDSC;

public class SHPMODEDSCRowMapper<T> implements RowMapper<SHPMODEDSC> {

    private static final Logger log = Logger.getLogger(SHPMODEDSCRowMapper.class);

	@Override
	public SHPMODEDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHPMODEDSC obj = new SHPMODEDSC();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
