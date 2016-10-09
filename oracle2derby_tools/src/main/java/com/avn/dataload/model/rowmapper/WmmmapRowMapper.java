package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Wmmmap;

public class WmmmapRowMapper<T> implements RowMapper<Wmmmap> {

	@Override
	public Wmmmap mapRow(ResultSet rs, int rowNum) throws SQLException {
		Wmmmap obj = new Wmmmap();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setMemberUniqueId(rs.getString("MEMBER_UNIQUE_ID"));
		obj.setLastsync(rs.getDate("LASTSYNC"));
		
		return obj;
	}

}
