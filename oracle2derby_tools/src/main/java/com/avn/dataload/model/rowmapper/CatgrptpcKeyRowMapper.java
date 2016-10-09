package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatgrptpcKey;

public class CatgrptpcKeyRowMapper<T> implements RowMapper<CatgrptpcKey> {

	@Override
	public CatgrptpcKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatgrptpcKey obj = new CatgrptpcKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setTradeposcnId(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
