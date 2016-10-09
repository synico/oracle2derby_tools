package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Policytype;

public class PolicytypeRowMapper<T> implements RowMapper<Policytype> {

	@Override
	public Policytype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Policytype obj = new Policytype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPolicytypeId(rs.getString("POLICYTYPE_ID"));
		
		return obj;
	}

}
