package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSEVENT;

public class BUSEVENTRowMapper<T> implements RowMapper<BUSEVENT> {

	@Override
	public BUSEVENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSEVENT obj = new BUSEVENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setEVENTDATA(rs.getString("EVENTDATA"));
		obj.setCHECKED(rs.getBigDecimal("CHECKED"));
		obj.setBUSEVENT_ID(rs.getBigDecimal("BUSEVENT_ID"));
		obj.setCREATETSTMP(rs.getTimestamp("CREATETSTMP"));
		obj.setEVENT_SEARCHKEY(rs.getString("EVENT_SEARCHKEY"));
		
		return obj;
	}

}
