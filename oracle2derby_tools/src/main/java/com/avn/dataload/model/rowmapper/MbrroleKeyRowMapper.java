package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.MbrroleKey;

public class MbrroleKeyRowMapper<T> implements RowMapper<MbrroleKey> {

	@Override
	public MbrroleKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		MbrroleKey obj = new MbrroleKey();
		
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setRoleId(rs.getBigDecimal("ROLE_ID"));
		
		return obj;
	}

}
