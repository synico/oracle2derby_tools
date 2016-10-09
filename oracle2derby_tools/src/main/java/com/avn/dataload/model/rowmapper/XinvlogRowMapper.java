package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xinvlog;

public class XinvlogRowMapper<T> implements RowMapper<Xinvlog> {

	@Override
	public Xinvlog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xinvlog obj = new Xinvlog();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getString("LASTUPDATE"));
		obj.setProcessed(rs.getString("PROCESSED"));
		obj.setSapmaterialid(rs.getString("SAPMATERIALID"));
		
		return obj;
	}

}
