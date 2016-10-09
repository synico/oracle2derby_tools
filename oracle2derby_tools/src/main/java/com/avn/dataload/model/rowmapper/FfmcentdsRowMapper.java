package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ffmcentds;

public class FfmcentdsRowMapper<T> implements RowMapper<Ffmcentds> {

	@Override
	public Ffmcentds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ffmcentds obj = new Ffmcentds();
		
		obj.setStaddressId(rs.getBigDecimal("STADDRESS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
