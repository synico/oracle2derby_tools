package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xofferlog;

public class XofferlogRowMapper<T> implements RowMapper<Xofferlog> {

	@Override
	public Xofferlog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xofferlog obj = new Xofferlog();
		
		obj.setStartdate(rs.getString("STARTDATE"));
		obj.setEnddate(rs.getString("ENDDATE"));
		obj.setQuantity(rs.getString("QUANTITY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setProcessed(rs.getString("PROCESSED"));
		obj.setPrice(rs.getString("PRICE"));
		obj.setUom(rs.getString("UOM"));
		obj.setPricelistname(rs.getString("PRICELISTNAME"));
		obj.setMaxquantity(rs.getString("MAXQUANTITY"));
		obj.setPriceperquantity(rs.getString("PRICEPERQUANTITY"));
		
		return obj;
	}

}
