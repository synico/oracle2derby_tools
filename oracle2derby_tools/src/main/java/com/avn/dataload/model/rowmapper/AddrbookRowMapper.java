package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Addrbook;

public class AddrbookRowMapper<T> implements RowMapper<Addrbook> {

	@Override
	public Addrbook mapRow(ResultSet rs, int rowNum) throws SQLException {
		Addrbook obj = new Addrbook();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAddrbookId(rs.getBigDecimal("ADDRBOOK_ID"));
		obj.setType(rs.getString("TYPE"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
