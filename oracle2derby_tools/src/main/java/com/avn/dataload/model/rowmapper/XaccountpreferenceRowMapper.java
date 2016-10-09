package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xaccountpreference;

public class XaccountpreferenceRowMapper<T> implements RowMapper<Xaccountpreference> {

	@Override
	public Xaccountpreference mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xaccountpreference obj = new Xaccountpreference();
		
		obj.setPreferenceId(rs.getString("PREFERENCE_ID"));
		
		return obj;
	}

}
