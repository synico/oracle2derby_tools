package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RFQRSPPROD;

public class RFQRSPPRODRowMapper<T> implements RowMapper<RFQRSPPROD> {

	@Override
	public RFQRSPPROD mapRow(ResultSet rs, int rowNum) throws SQLException {
		RFQRSPPROD obj = new RFQRSPPROD();
		
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
		obj.setRFQRSPPROD_ID(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setRFQPROD_ID(rs.getBigDecimal("RFQPROD_ID"));
		obj.setPRICEADJUSTMENT(rs.getBigDecimal("PRICEADJUSTMENT"));
		obj.setRFQCATENTRYID(rs.getBigDecimal("RFQCATENTRYID"));
		obj.setRFQRSP_ID(rs.getBigDecimal("RFQRSP_ID"));
		obj.setSKUGENFLAG(rs.getBigDecimal("SKUGENFLAG"));
		
		return obj;
	}

}
