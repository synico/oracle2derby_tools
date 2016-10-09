package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Invadjdesc;

public class InvadjdescRowMapper<T> implements RowMapper<Invadjdesc> {

	@Override
	public Invadjdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invadjdesc obj = new Invadjdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
