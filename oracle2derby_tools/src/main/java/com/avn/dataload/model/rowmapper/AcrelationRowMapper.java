package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acrelation;

public class AcrelationRowMapper<T> implements RowMapper<Acrelation> {

	@Override
	public Acrelation mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acrelation obj = new Acrelation();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAcrelationId(rs.getBigDecimal("ACRELATION_ID"));
		obj.setRelationname(rs.getString("RELATIONNAME"));
		
		return obj;
	}

}
