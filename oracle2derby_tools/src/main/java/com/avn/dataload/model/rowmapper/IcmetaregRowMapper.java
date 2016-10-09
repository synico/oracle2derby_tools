package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Icmetareg;

public class IcmetaregRowMapper<T> implements RowMapper<Icmetareg> {

	@Override
	public Icmetareg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Icmetareg obj = new Icmetareg();
		
		obj.setMetaphortypeid(rs.getBigDecimal("METAPHORTYPEID"));
		obj.setBuildername(rs.getString("BUILDERNAME"));
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setExplspcreq(rs.getBigDecimal("EXPLSPCREQ"));
		
		return obj;
	}

}
