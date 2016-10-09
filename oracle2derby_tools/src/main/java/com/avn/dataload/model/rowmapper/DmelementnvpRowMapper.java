package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmelementnvp;

public class DmelementnvpRowMapper<T> implements RowMapper<Dmelementnvp> {

	@Override
	public Dmelementnvp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmelementnvp obj = new Dmelementnvp();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setTriggermatch(rs.getBigDecimal("TRIGGERMATCH"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
