package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftaskdsc;

public class CmftaskdscRowMapper<T> implements RowMapper<Cmftaskdsc> {

	@Override
	public Cmftaskdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftaskdsc obj = new Cmftaskdsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
