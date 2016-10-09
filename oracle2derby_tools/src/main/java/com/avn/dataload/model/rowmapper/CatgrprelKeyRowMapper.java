package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CatgrprelKey;

public class CatgrprelKeyRowMapper<T> implements RowMapper<CatgrprelKey> {

	@Override
	public CatgrprelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CatgrprelKey obj = new CatgrprelKey();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setCatgroupIdChild(rs.getBigDecimal("CATGROUP_ID_CHILD"));
		obj.setCatgroupIdParent(rs.getBigDecimal("CATGROUP_ID_PARENT"));
		
		return obj;
	}

}
