package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Colltype;

public class ColltypeRowMapper<T> implements RowMapper<Colltype> {

	@Override
	public Colltype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Colltype obj = new Colltype();
		
		obj.setName(rs.getString("NAME"));
		obj.setColltypeId(rs.getBigDecimal("COLLTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
