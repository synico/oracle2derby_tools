package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flowtype;

public class FlowtypeRowMapper<T> implements RowMapper<Flowtype> {

	@Override
	public Flowtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flowtype obj = new Flowtype();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setAttribute(rs.getString("ATTRIBUTE"));
		obj.setFlowdomainId(rs.getBigDecimal("FLOWDOMAIN_ID"));
		obj.setBizflowbeanclass(rs.getString("BIZFLOWBEANCLASS"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setViewname(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
