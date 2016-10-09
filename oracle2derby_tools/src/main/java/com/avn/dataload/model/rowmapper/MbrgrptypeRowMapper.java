package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrgrptype;

public class MbrgrptypeRowMapper<T> implements RowMapper<Mbrgrptype> {

	@Override
	public Mbrgrptype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrgrptype obj = new Mbrgrptype();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setName(rs.getString("NAME"));
		obj.setMbrgrptypeId(rs.getBigDecimal("MBRGRPTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
