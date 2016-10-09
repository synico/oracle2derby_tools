package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catfltdsc;

public class CatfltdscRowMapper<T> implements RowMapper<Catfltdsc> {

	@Override
	public Catfltdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catfltdsc obj = new Catfltdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
