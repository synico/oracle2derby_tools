package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatalogdscKey;

public class CatalogdscKeyRowMapper<T> implements RowMapper<CatalogdscKey> {

	@Override
	public CatalogdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatalogdscKey obj = new CatalogdscKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
