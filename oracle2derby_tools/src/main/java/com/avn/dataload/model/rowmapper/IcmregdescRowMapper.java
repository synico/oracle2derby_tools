package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Icmregdesc;

public class IcmregdescRowMapper<T> implements RowMapper<Icmregdesc> {

	@Override
	public Icmregdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Icmregdesc obj = new Icmregdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTitle(rs.getString("TITLE"));
		obj.setIconname(rs.getString("ICONNAME"));
		
		return obj;
	}

}
