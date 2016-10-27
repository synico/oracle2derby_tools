package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSEVENT;

public class BUSEVENTRowMapper<T> implements RowMapper<BUSEVENT> {

    private static final Logger log = Logger.getLogger(BUSEVENTRowMapper.class);

	@Override
	public BUSEVENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSEVENT obj = new BUSEVENT();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBUSEVENT_ID(rs.getBigDecimal("BUSEVENT_ID"));
		obj.setCREATETSTMP(rs.getTimestamp("CREATETSTMP"));
		obj.setEVENT_SEARCHKEY(rs.getString("EVENT_SEARCHKEY"));
		obj.setEVENTDATA(rs.getString("EVENTDATA"));
		obj.setCHECKED(rs.getBigDecimal("CHECKED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
