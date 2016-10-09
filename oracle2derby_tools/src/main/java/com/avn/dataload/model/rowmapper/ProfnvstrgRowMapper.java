package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Profnvstrg;

public class ProfnvstrgRowMapper<T> implements RowMapper<Profnvstrg> {

	@Override
	public Profnvstrg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profnvstrg obj = new Profnvstrg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setProfnvstrgId(rs.getBigDecimal("PROFNVSTRG_ID"));
		obj.setProfileattname(rs.getString("PROFILEATTNAME"));
		obj.setProfileattvalue(rs.getString("PROFILEATTVALUE"));
		obj.setProfileId(rs.getBigDecimal("PROFILE_ID"));
		
		return obj;
	}

}
