package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OfferpriceKey;

public class OfferpriceKeyRowMapper<T> implements RowMapper<OfferpriceKey> {

	@Override
	public OfferpriceKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OfferpriceKey obj = new OfferpriceKey();
		
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setOfferId(rs.getBigDecimal("OFFER_ID"));
		
		return obj;
	}

}
