package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Msgtypes;

public class MsgtypesRowMapper<T> implements RowMapper<Msgtypes> {

	@Override
	public Msgtypes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Msgtypes obj = new Msgtypes();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMsgtypeId(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setMsgtdir(rs.getBigDecimal("MSGTDIR"));
		obj.setViewname(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
