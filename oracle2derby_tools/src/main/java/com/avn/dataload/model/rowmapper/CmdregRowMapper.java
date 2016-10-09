package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmdreg;

public class CmdregRowMapper<T> implements RowMapper<Cmdreg> {

	@Override
	public Cmdreg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmdreg obj = new Cmdreg();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setTarget(rs.getString("TARGET"));
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
