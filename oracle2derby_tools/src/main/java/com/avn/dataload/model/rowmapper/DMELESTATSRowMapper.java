package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELESTATS;

public class DMELESTATSRowMapper<T> implements RowMapper<DMELESTATS> {

    private static final Logger log = Logger.getLogger(DMELESTATSRowMapper.class);

	@Override
	public DMELESTATS mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELESTATS obj = new DMELESTATS();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
