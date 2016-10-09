package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Streltyp;

public class StreltypRowMapper<T> implements RowMapper<Streltyp> {

	@Override
	public Streltyp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Streltyp obj = new Streltyp();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStreltypId(rs.getBigDecimal("STRELTYP_ID"));
		
		return obj;
	}

}
