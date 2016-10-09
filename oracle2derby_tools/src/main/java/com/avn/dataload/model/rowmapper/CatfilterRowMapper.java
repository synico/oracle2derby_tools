package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catfilter;

public class CatfilterRowMapper<T> implements RowMapper<Catfilter> {

	@Override
	public Catfilter mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catfilter obj = new Catfilter();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setCatfilterId(rs.getBigDecimal("CATFILTER_ID"));
		obj.setUsage(rs.getBigDecimal("USAGE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		
		return obj;
	}

}
