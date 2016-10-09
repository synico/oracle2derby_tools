package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OrderhistKey;

public class OrderhistKeyRowMapper<T> implements RowMapper<OrderhistKey> {

	@Override
	public OrderhistKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderhistKey obj = new OrderhistKey();
		
		obj.setOrderversion(rs.getBigDecimal("ORDERVERSION"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
