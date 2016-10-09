package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgrprel;

public class CatgrprelRowMapper<T> implements RowMapper<Catgrprel> {

	@Override
	public Catgrprel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgrprel obj = new Catgrprel();
		
		obj.setCatalogIdLink(rs.getBigDecimal("CATALOG_ID_LINK"));
		obj.setRule(rs.getString("RULE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
