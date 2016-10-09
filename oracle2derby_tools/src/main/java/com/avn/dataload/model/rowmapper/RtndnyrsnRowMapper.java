package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rtndnyrsn;

public class RtndnyrsnRowMapper<T> implements RowMapper<Rtndnyrsn> {

	@Override
	public Rtndnyrsn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rtndnyrsn obj = new Rtndnyrsn();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setRtndnyrsnId(rs.getBigDecimal("RTNDNYRSN_ID"));
		
		return obj;
	}

}
