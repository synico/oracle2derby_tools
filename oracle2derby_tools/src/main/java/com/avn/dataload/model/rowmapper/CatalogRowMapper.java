package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catalog;

public class CatalogRowMapper<T> implements RowMapper<Catalog> {

	@Override
	public Catalog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catalog obj = new Catalog();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setTpclevel(rs.getBigDecimal("TPCLEVEL"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
