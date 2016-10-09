package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flstategp;

public class FlstategpRowMapper<T> implements RowMapper<Flstategp> {

	@Override
	public Flstategp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flstategp obj = new Flstategp();
		
		obj.setFlstategpId(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setMandatorystategp(rs.getBigDecimal("MANDATORYSTATEGP"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		
		return obj;
	}

}
