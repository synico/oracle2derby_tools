package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Schcmd;

public class SchcmdRowMapper<T> implements RowMapper<Schcmd> {

	@Override
	public Schcmd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Schcmd obj = new Schcmd();
		
		obj.setSchcmdId(rs.getBigDecimal("SCHCMD_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPathinfo(rs.getString("PATHINFO"));
		
		return obj;
	}

}
