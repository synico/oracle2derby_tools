package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Site;

public class SiteRowMapper<T> implements RowMapper<Site> {

	@Override
	public Site mapRow(ResultSet rs, int rowNum) throws SQLException {
		Site obj = new Site();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDatabasevendor(rs.getString("DATABASEVENDOR"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setEdition(rs.getString("EDITION"));
		obj.setRelease(rs.getBigDecimal("RELEASE"));
		obj.setMod(rs.getBigDecimal("MOD"));
		obj.setFixpack(rs.getBigDecimal("FIXPACK"));
		obj.setCompname(rs.getString("COMPNAME"));
		
		return obj;
	}

}
