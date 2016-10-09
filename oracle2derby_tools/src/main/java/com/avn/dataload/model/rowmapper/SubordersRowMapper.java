package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Suborders;

public class SubordersRowMapper<T> implements RowMapper<Suborders> {

	@Override
	public Suborders mapRow(ResultSet rs, int rowNum) throws SQLException {
		Suborders obj = new Suborders();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setTotalproduct(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTotaladjustment(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setTotalshipping(rs.getBigDecimal("TOTALSHIPPING"));
		obj.setTotaltaxshipping(rs.getBigDecimal("TOTALTAXSHIPPING"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setTotaltax(rs.getBigDecimal("TOTALTAX"));
		obj.setSuborderId(rs.getBigDecimal("SUBORDER_ID"));
		
		return obj;
	}

}
