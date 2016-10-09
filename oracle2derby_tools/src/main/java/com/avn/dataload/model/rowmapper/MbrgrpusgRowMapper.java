package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrgrpusg;

public class MbrgrpusgRowMapper<T> implements RowMapper<Mbrgrpusg> {

	@Override
	public Mbrgrpusg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrgrpusg obj = new Mbrgrpusg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		
		return obj;
	}

}
