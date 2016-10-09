package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromoarg;

public class PxPromoargRowMapper<T> implements RowMapper<PxPromoarg> {

	@Override
	public PxPromoarg mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromoarg obj = new PxPromoarg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setDetail(rs.getString("DETAIL"));
		
		return obj;
	}

}
