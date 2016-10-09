package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attachusg;

public class AttachusgRowMapper<T> implements RowMapper<Attachusg> {

	@Override
	public Attachusg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attachusg obj = new Attachusg();
		
		obj.setAttachusgId(rs.getString("ATTACHUSG_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
