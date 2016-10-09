package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxGrppolicy;

public class PxGrppolicyRowMapper<T> implements RowMapper<PxGrppolicy> {

	@Override
	public PxGrppolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxGrppolicy obj = new PxGrppolicy();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
