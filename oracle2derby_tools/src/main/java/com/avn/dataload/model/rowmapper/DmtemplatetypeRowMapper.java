package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmtemplatetype;

public class DmtemplatetypeRowMapper<T> implements RowMapper<Dmtemplatetype> {

	@Override
	public Dmtemplatetype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmtemplatetype obj = new Dmtemplatetype();
		
		obj.setDmtemplatetypeId(rs.getBigDecimal("DMTEMPLATETYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getString("TYPE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
