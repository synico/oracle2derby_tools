package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftgdsc;

public class CmftgdscRowMapper<T> implements RowMapper<Cmftgdsc> {

	@Override
	public Cmftgdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftgdsc obj = new Cmftgdsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
