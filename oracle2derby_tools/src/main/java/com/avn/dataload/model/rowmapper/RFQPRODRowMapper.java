package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RFQPROD;

public class RFQPRODRowMapper<T> implements RowMapper<RFQPROD> {

	@Override
	public RFQPROD mapRow(ResultSet rs, int rowNum) throws SQLException {
		RFQPROD obj = new RFQPROD();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setPRICE(rs.getBigDecimal("PRICE"));
		obj.setCHANGEABLE(rs.getBigDecimal("CHANGEABLE"));
		obj.setRFQPROD_ID(rs.getBigDecimal("RFQPROD_ID"));
		obj.setRFQPRODNAME(rs.getString("RFQPRODNAME"));
		obj.setRFQCATEGRY_ID(rs.getBigDecimal("RFQCATEGRY_ID"));
		obj.setPRICEADJUSTMENT(rs.getBigDecimal("PRICEADJUSTMENT"));
		obj.setNEGOTIATIONTYPE(rs.getBigDecimal("NEGOTIATIONTYPE"));
		obj.setRFQ_ID(rs.getBigDecimal("RFQ_ID"));
		
		return obj;
	}

}
