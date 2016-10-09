package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acaction;

public class AcactionRowMapper<T> implements RowMapper<Acaction> {

	@Override
	public Acaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acaction obj = new Acaction();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAcactionId(rs.getBigDecimal("ACACTION_ID"));
		obj.setAction(rs.getString("ACTION"));
		
		return obj;
	}

}
