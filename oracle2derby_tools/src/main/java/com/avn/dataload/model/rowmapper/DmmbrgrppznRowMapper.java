package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmmbrgrppzn;

public class DmmbrgrppznRowMapper<T> implements RowMapper<Dmmbrgrppzn> {

	@Override
	public Dmmbrgrppzn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmmbrgrppzn obj = new Dmmbrgrppzn();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
