package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Langpair;

public class LangpairRowMapper<T> implements RowMapper<Langpair> {

	@Override
	public Langpair mapRow(ResultSet rs, int rowNum) throws SQLException {
		Langpair obj = new Langpair();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
