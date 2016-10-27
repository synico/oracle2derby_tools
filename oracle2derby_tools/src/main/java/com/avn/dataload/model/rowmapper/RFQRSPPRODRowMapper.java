package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RFQRSPPROD;

public class RFQRSPPRODRowMapper<T> implements RowMapper<RFQRSPPROD> {

    private static final Logger log = Logger.getLogger(RFQRSPPRODRowMapper.class);

	@Override
	public RFQRSPPROD mapRow(ResultSet rs, int rowNum) throws SQLException {
		RFQRSPPROD obj = new RFQRSPPROD();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setRFQRSPPROD_ID(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setPRICEADJUSTMENT(rs.getBigDecimal("PRICEADJUSTMENT"));
		obj.setRFQCATENTRYID(rs.getBigDecimal("RFQCATENTRYID"));
		obj.setPRICE(rs.getBigDecimal("PRICE"));
		obj.setRFQPROD_ID(rs.getBigDecimal("RFQPROD_ID"));
		obj.setRFQRSP_ID(rs.getBigDecimal("RFQRSP_ID"));
		obj.setSKUGENFLAG(rs.getBigDecimal("SKUGENFLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
