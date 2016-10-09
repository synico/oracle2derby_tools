package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rfqrspprod;

public class RfqrspprodRowMapper<T> implements RowMapper<Rfqrspprod> {

	@Override
	public Rfqrspprod mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rfqrspprod obj = new Rfqrspprod();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setRfqrspprodId(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setPriceadjustment(rs.getBigDecimal("PRICEADJUSTMENT"));
		obj.setRfqcatentryid(rs.getBigDecimal("RFQCATENTRYID"));
		obj.setPrice(rs.getBigDecimal("PRICE"));
		obj.setRfqprodId(rs.getBigDecimal("RFQPROD_ID"));
		obj.setRfqrspId(rs.getBigDecimal("RFQRSP_ID"));
		obj.setSkugenflag(rs.getBigDecimal("SKUGENFLAG"));
		
		return obj;
	}

}
