package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcytycmif;

public class PlcytycmifRowMapper<T> implements RowMapper<Plcytycmif> {

	@Override
	public Plcytycmif mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcytycmif obj = new Plcytycmif();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBusinesscmdif(rs.getString("BUSINESSCMDIF"));
		obj.setPolicytypeId(rs.getString("POLICYTYPE_ID"));
		
		return obj;
	}

}
