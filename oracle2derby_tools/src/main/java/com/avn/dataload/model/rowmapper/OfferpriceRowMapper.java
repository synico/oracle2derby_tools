package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Offerprice;

public class OfferpriceRowMapper<T> implements RowMapper<Offerprice> {

	@Override
	public Offerprice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offerprice obj = new Offerprice();
		
		obj.setCompareprice(rs.getBigDecimal("COMPAREPRICE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPrice(rs.getBigDecimal("PRICE"));
		
		return obj;
	}

}
