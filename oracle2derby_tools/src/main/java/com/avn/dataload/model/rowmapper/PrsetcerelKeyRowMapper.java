package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PrsetcerelKey;

public class PrsetcerelKeyRowMapper<T> implements RowMapper<PrsetcerelKey> {

	@Override
	public PrsetcerelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PrsetcerelKey obj = new PrsetcerelKey();
		
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		
		return obj;
	}

}
