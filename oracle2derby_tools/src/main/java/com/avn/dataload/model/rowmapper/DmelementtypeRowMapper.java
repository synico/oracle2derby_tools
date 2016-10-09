package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmelementtype;

public class DmelementtypeRowMapper<T> implements RowMapper<Dmelementtype> {

	@Override
	public Dmelementtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmelementtype obj = new Dmelementtype();
		
		obj.setDmelementtypeId(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getString("TYPE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
