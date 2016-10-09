package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rfqprod;

public class RfqprodRowMapper<T> implements RowMapper<Rfqprod> {

	@Override
	public Rfqprod mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rfqprod obj = new Rfqprod();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setRfqprodname(rs.getString("RFQPRODNAME"));
		obj.setRfqcategryId(rs.getBigDecimal("RFQCATEGRY_ID"));
		obj.setPriceadjustment(rs.getBigDecimal("PRICEADJUSTMENT"));
		obj.setNegotiationtype(rs.getBigDecimal("NEGOTIATIONTYPE"));
		obj.setPrice(rs.getBigDecimal("PRICE"));
		obj.setChangeable(rs.getBigDecimal("CHANGEABLE"));
		obj.setRfqprodId(rs.getBigDecimal("RFQPROD_ID"));
		obj.setRfqId(rs.getBigDecimal("RFQ_ID"));
		
		return obj;
	}

}
