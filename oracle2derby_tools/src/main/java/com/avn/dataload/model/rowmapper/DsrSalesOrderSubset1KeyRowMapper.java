package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrSalesOrderSubset1Key;

public class DsrSalesOrderSubset1KeyRowMapper<T> implements RowMapper<DsrSalesOrderSubset1Key> {

	@Override
	public DsrSalesOrderSubset1Key mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrSalesOrderSubset1Key obj = new DsrSalesOrderSubset1Key();
		
		obj.setScn(rs.getString("SCN"));
		obj.setLineItemNbr(rs.getString("LINE_ITEM_NBR"));
		
		return obj;
	}

}
