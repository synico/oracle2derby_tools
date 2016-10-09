package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlmsg;

public class EmlmsgRowMapper<T> implements RowMapper<Emlmsg> {

	@Override
	public Emlmsg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlmsg obj = new Emlmsg();
		
		obj.setName(rs.getString("NAME"));
		obj.setPropertyfile(rs.getString("PROPERTYFILE"));
		obj.setEmlbodytype(rs.getBigDecimal("EMLBODYTYPE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setEmlmsgId(rs.getBigDecimal("EMLMSG_ID"));
		obj.setJsppath(rs.getString("JSPPATH"));
		
		return obj;
	}

}
